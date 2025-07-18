package com.infosys.order_service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OrderResponseDto {
    private String orderId;
    private String displayName;
    private String sellerName;
    private Double price;
    private Integer quantity;
    private Double totalPrice;
    private LocalDate orderedDate;
    private String orderStatus;
    private String category;
}
