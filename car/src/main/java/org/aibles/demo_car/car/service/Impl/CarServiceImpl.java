package org.aibles.demo_car.car.service.Impl;


import org.aibles.demo_car.car.entity.Car;
import org.aibles.demo_car.car.repository.CarRepository;
import org.aibles.demo_car.car.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;


    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car createdCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car updateCar(int id, Car car) {
        return null;
    }

    @Override
    public List<Car> listCar() {
        return carRepository.findAll();
    }
}
