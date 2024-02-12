package com.example.marketplace.repostory;

import com.example.marketplace.entity.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreProductRepostory extends JpaRepository<StoreProduct,Long> {
}
