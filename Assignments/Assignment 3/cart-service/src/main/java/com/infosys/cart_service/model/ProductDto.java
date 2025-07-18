package com.infosys.cart_service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private String productId;
    private String productName;
    private String description;
    private Double price;
    private Double discount;
    private Double deliveryCharges;
    private Double avgRating;
    private String sellerName;
}
