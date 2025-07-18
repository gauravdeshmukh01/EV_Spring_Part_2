package com.infosys.order_service.controller;


import com.infosys.order_service.dto.OrderRequestDto;
import com.infosys.order_service.dto.OrderResponseDto;
import com.infosys.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public List<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto request) {
        return orderService.placeOrder(request.getBuyerName());
    }

}
