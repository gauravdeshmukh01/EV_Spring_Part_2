package com.infosys.cart_service.service;


import com.infosys.cart_service.model.Cart;

import java.util.List;

public interface CartServiceInterface{
    Cart addItem(Cart cart);
    List<Cart> getItemsByBuyer(String buyerName);
}
