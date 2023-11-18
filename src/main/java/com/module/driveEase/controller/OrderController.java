package com.module.driveEase.controller;

import com.module.driveEase.domain.PlacedOrder;
import com.module.driveEase.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public List<PlacedOrder> getOrders() {
        return orderService.getOrders();
    }
}
