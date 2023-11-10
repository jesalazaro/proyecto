package com.module.driveEase.repository;

import com.module.driveEase.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CarRepository extends JpaRepository<Car, Long> {


}
