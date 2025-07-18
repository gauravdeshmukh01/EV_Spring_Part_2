package com.infosys.Wishlist_service.controller;


import com.infosys.Wishlist_service.model.Wishlist;
import com.infosys.Wishlist_service.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService service;

    @PostMapping("/addwishlist")
    public String add(@RequestBody Wishlist wishlist) {
        return service.add(wishlist);
    }

    @GetMapping("/{userId}")
    public List<Wishlist> get(@PathVariable("userId") String userId) {
        return service.list(userId);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "Deleted";
    }


}
