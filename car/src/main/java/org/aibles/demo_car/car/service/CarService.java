package org.aibles.demo_car.car.service;

import org.aibles.demo_car.car.entity.Car;

import java.util.List;

public interface CarService {
    Car createdCar (Car car);
    void delete(int id);

    Car updateCar (int id, Car car);

    List<Car> listCar();


}
