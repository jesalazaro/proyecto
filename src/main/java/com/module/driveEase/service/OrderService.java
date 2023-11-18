package com.module.driveEase.service;

import com.module.driveEase.domain.PlacedOrder;
import com.module.driveEase.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderService {
    private final Long ID = null;
    private final OrderRepository orderRepository;


    public List<PlacedOrder> getOrders() {
        log.info("Fetching all orders");
        return orderRepository.findAll();
    }
}
