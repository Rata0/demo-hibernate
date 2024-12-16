package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }
}
