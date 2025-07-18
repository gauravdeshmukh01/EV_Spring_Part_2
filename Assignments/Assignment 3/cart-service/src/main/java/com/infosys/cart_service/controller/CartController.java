package com.infosys.cart_service.controller;


import com.infosys.cart_service.model.Cart;
import com.infosys.cart_service.service.CartService;
import com.infosys.cart_service.service.CartServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServiceInterface cartService;

    @PostMapping("/add")
    public Cart addItem(@RequestBody Cart cart) {
        return cartService.addItem(cart);
    }

    @GetMapping("/{buyerName}")
    public List<Cart> getCartItems(@PathVariable String buyerName) {
        return cartService.getItemsByBuyer(buyerName);
    }
}
