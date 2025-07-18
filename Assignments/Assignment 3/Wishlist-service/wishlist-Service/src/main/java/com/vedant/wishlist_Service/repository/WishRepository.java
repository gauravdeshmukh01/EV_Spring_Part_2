package com.vedant.wishlist_Service.repository;

import com.vedant.wishlist_Service.entity.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish, String> {
    List<Wish> findByUserId(String userId);
}
