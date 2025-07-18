package com.infosys.cart_service.openfeign;

import com.infosys.cart_service.model.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") String id);
}
