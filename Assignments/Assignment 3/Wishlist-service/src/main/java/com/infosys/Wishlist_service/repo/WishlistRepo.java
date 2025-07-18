package com.infosys.Wishlist_service.repo;

import com.infosys.Wishlist_service.model.Wishlist;
import com.infosys.Wishlist_service.repo.WishlistRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepo extends JpaRepository<Wishlist, Long> {
    List<Wishlist> findByUserId(String userId);
}
