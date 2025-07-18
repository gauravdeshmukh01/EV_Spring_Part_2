package com.infosys.Product_Service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    @Column(length = 5)
    private String productId;

    @Column(length = 50)
    @NotBlank(message = "Product name is mandatory....")
    private String productName;

    @Column(length = 200)
    private String description;

    private Double price;
    private Double discount;
    private Double deliveryCharges;
    private Double avgRating;

    @Column(length = 15)
    private String sellerName;

}
