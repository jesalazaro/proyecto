package com.module.driveEase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CarDto {

    private String registrationNr;
    private String brand;
    private String model;
    private Boolean isAvailable;
    private String type;
    private String vendor;
    private Integer kmTraveled;

}