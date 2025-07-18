package com.infosys.Wishlist_service.service;

import com.infosys.Wishlist_service.model.Wishlist;
import com.infosys.Wishlist_service.repo.WishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepo repo;



    public String add(Wishlist wish) {
        repo.save(wish);
        return "Added to wishlist";
    }

    public List<Wishlist> list(String userId) {
        return repo.findByUserId(userId);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
