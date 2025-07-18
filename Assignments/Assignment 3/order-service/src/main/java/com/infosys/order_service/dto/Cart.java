package com.infosys.order_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private String cartId;
    private String productName;
    private String sellerName;
    private Integer quantity;
    private Double cartOfferPrice;
    private String buyerName;
    private String category;

}
