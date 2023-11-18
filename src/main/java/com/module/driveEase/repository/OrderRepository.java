package com.module.driveEase.repository;

import com.module.driveEase.domain.PlacedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<PlacedOrder, Long> {}

