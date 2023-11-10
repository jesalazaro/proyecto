package com.module.driveEase.dto;

import com.module.driveEase.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarDtoMapper {

    public static Car mapToCar(CarDto carDto) {

        return Car.builder()
                .registrationNr(carDto.getRegistrationNr())
                .brand(carDto.getBrand())
                .model(carDto.getModel())
                .isAvailable(carDto.getIsAvailable())
                .type(carDto.getType())
                .kmTraveled(carDto.getKmTraveled())
                .build();

    }

}

