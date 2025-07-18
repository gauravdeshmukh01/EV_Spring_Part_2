package com.infosys.cart_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cart")
@Getter
@Setter
public class Cart {

    @Id
    @Column(length = 5)
    private String cartId;

    @Column(length = 5)
    private String productId;

    @Column(length = 50)
    private String productName;

    @Column(length = 15)
    private String sellerName;
    private Integer quantity;
    private Double cartOfferPrice;
    private String buyerName;
}
