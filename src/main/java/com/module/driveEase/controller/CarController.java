package com.module.driveEase.controller;


import com.module.driveEase.domain.Car;
import com.module.driveEase.dto.CarDto;
import com.module.driveEase.repository.CarRepository;
import com.module.driveEase.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@SpringBootApplication
@RestController
@RequiredArgsConstructor
@RequestMapping("module")
@ResponseBody
public class CarController {
    @Autowired
    private CarService carService;

    private  final CarRepository carRepository;

    @CrossOrigin
    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @CrossOrigin
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }


    @CrossOrigin
    @PostMapping("/cars")
    public Car saveCar(@RequestBody CarDto carDto) {
        return carService.saveCar(carDto);
    }

    @CrossOrigin
    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }

    @CrossOrigin
    @PutMapping("/cars/{id}")
    public Car editCar(@PathVariable Long id, @RequestBody CarDto carDto) {
        return carService.editCar(id, carDto);
    }


}
