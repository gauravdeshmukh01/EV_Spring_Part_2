package com.infosys.order_service.service;

import com.infosys.order_service.dto.OrderResponseDto;

import java.util.List;

public interface OrderServiceInterface {

    List<OrderResponseDto> placeOrder(String buyerName);

}
