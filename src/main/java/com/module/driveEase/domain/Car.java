package com.module.driveEase.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Getter @Setter
    @Column(name = "registration_nr", nullable = false)
    private String registrationNr;


    @Getter @Setter
    @Column(name = "brand", nullable = false)
    private String brand;


    @Getter @Setter
    @Column(name = "model", nullable = false)
    private String model;

    @Getter @Setter
    @Column(name = "is_available", nullable = false)
    private Boolean isAvailable;


    @Getter @Setter
    @Column(name = "type", nullable = false)
    private String type;

    @Getter @Setter
    @Column(name = "km_traveled", nullable = false)
    private  Integer kmTraveled;


}
