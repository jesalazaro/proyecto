package com.module.driveEase.service;


import com.module.driveEase.domain.Car;
import com.module.driveEase.dto.CarDto;
import com.module.driveEase.repository.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import com.module.driveEase.dto.CarDtoMapper;

import static com.module.driveEase.dto.CarDtoMapper.mapToCar;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CarService {

    private final CarRepository carRepository;

    public Car getCar(Long id) {
        log.info("Fetching car with id {}", id);
        return carRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Car With This ID Does Not Exists!"));
    }

    public List<Car> getAllCars() {
        log.info("Fetching all cars");
        return carRepository.findAll();
    }

    public Car saveCar(CarDto carDto) {
        log.info("Saving new car {} {} to the database", carDto.getBrand(), carDto.getModel());
        Car car = mapToCar(carDto);
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        log.info("Deleting car with id {}", id);
        if(!carRepository.existsById(id)) {

            throw new EntityNotFoundException("This Car Does Not Exists!");
        }
        carRepository.deleteById(id);
    }

    public Car editCar(Long id, CarDto carDto) {
        Car carEdited = carRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("This Car Does Not Exists!"));
        log.info("Edition car with id {}", id);
        carEdited.setRegistrationNr(carDto.getRegistrationNr());
        carEdited.setBrand(carDto.getBrand());
        carEdited.setModel(carDto.getModel());
        carEdited.setIsAvailable(carDto.getIsAvailable());
        carEdited.setType(carDto.getType());
        carEdited.setKmTraveled(carDto.getKmTraveled());
        return carRepository.save(carEdited);
    }
}
