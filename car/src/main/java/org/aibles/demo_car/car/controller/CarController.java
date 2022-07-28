package org.aibles.demo_car.car.controller;

import org.aibles.demo_car.car.entity.Car;
import org.aibles.demo_car.car.service.CarService;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Car> createdCar(@RequestBody Car car) {
        Car createdCar = carService.createdCar(car);
        return new ResponseEntity<>(createdCar, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Car>>listCar() {
        List<Car> listCar = carService.listCar();
        return new ResponseEntity<>(listCar, HttpStatus.OK);
    }
}
