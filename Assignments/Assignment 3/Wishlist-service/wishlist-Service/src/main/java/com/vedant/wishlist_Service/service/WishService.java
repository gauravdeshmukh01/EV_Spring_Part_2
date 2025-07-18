package com.vedant.wishlist_Service.service;

import com.vedant.wishlist_Service.entity.Wish;
import com.vedant.wishlist_Service.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishService {

    @Autowired
    private WishRepository wishRepo;

    public String add(Wish wish) {
        wishRepo.save(wish);
        return "Added to wishlist";
    }

    public List<Wish> list(String userId) {
        return wishRepo.findByUserId(userId);
    }

    public void delete(String id) {
        wishRepo.deleteById(id);
    }
}
