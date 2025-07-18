package com.infosys.order_service.openfeign;


import com.infosys.order_service.dto.Cart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "cart-service")
public interface CartClient {
    @GetMapping("/cart/{buyerName}")
    List<Cart> getCartItems(@PathVariable String buyerName);
}
