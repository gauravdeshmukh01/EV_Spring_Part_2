package com.infosys.cart_service.repo;


import com.infosys.cart_service.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<Cart, String> {
    List<Cart> findByBuyerName(String buyerName);
}
