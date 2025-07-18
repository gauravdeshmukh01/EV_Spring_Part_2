package com.infosys.order_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @Column(length = 5)
    private String orderId;

    @Column(length = 50)
    private String displayName;

    @Column(length = 20)
    private String category;

    @Column(length = 15)
    private String sellerName;
    private Double price;
    private Integer quantity;
    private Double totalPrice;
    private LocalDate orderedDate;

    @Column(length = 10)
    private String orderStatus;
    private String buyerName;

}
