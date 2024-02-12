package com.example.marketplace.repostory;

import com.example.marketplace.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepostory extends JpaRepository<Category,Long> {
}
