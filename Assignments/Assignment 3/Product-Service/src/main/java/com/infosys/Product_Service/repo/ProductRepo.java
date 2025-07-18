package com.infosys.Product_Service.repo;


import com.infosys.Product_Service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {
    List<Product> findByProductNameContainingIgnoreCase(String keyword);
}
