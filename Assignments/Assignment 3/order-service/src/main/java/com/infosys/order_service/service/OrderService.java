package com.infosys.order_service.service;


import com.infosys.order_service.dto.Cart;
import com.infosys.order_service.dto.OrderResponseDto;
import com.infosys.order_service.model.Order;
import com.infosys.order_service.openfeign.CartClient;
import com.infosys.order_service.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    @Autowired
    private CartClient cartClient;

    @Autowired
    private OrderRepo orderRepository;

    @Override
    public List<OrderResponseDto> placeOrder(String buyerName) {
        List<Cart> cartItems = cartClient.getCartItems(buyerName);
        List<OrderResponseDto> responses = new ArrayList<>();

        for (Cart item : cartItems) {
            Order order = new Order();

            String shortId = "O" + (int)(Math.random() * 9000 + 1000);
            order.setOrderId(shortId);
            order.setBuyerName(buyerName);
            order.setDisplayName(item.getProductName());
            order.setSellerName(item.getSellerName());
            order.setQuantity(item.getQuantity());
            order.setPrice(item.getCartOfferPrice());
            order.setTotalPrice(item.getQuantity() * item.getCartOfferPrice());
            order.setOrderedDate(LocalDate.now());
            order.setOrderStatus("OPEN");

            orderRepository.save(order);

            OrderResponseDto response = new OrderResponseDto();
            response.setOrderId(order.getOrderId());
            response.setDisplayName(order.getDisplayName());
            response.setSellerName(order.getSellerName());
            response.setPrice(order.getPrice());
            response.setQuantity(order.getQuantity());
            response.setTotalPrice(order.getTotalPrice());
            response.setOrderedDate(order.getOrderedDate());
            response.setOrderStatus(order.getOrderStatus());

            responses.add(response);
        }

        return responses;
    }

}
