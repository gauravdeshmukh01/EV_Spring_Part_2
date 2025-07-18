package com.infosys.Wishlist_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wishlist")
public class Wishlist {

    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishId;


    @Column(length = 50)
    private String displayName;

    @Column(length = 50)
    private String shortDesc;

    @Column(length = 20)
    private String category;

    private String userId;
}
