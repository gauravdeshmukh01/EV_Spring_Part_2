package com.vedant.wishlist_Service.cntroller;

import com.vedant.wishlist_Service.entity.Wish;
import com.vedant.wishlist_Service.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlist")
public class WishController {

    @Autowired
    private WishService wishSrvice;

    @PostMapping("/addwishlist")
    public String add(@RequestBody Wish wish) {
        return wishSrvice.add(wish);
    }

    @GetMapping("/{userId}")
    public List<Wish> get(@PathVariable String userId) {
        return wishSrvice.list(userId);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        wishSrvice.delete(id);
        return "Deleted";
    }
}
