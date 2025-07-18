package com.infosys.cart_service.service;

import com.infosys.cart_service.model.Cart;
import com.infosys.cart_service.model.ProductDto;
import com.infosys.cart_service.openfeign.ProductClient;
import com.infosys.cart_service.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements CartServiceInterface {

    @Autowired
    private CartRepo cartRepository;

    @Autowired
    private ProductClient productClient;

    @Override
    public Cart addItem(Cart cart) {
        ProductDto product = productClient.getProductById(cart.getProductId());

        cart.setProductName(product.getProductName());
        cart.setSellerName(product.getSellerName());
        cart.setCartOfferPrice(product.getPrice() - product.getDiscount());

        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getItemsByBuyer(String buyerName) {
        return cartRepository.findByBuyerName(buyerName);
    }
}
