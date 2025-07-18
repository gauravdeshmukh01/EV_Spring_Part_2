package com.infosys.Product_Service.service;

import com.infosys.Product_Service.model.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product addProduct(Product product);
    List<Product> searchProducts(String keyword);
    Product getProductById(String id);
    List<Product> getAllProducts();

}
