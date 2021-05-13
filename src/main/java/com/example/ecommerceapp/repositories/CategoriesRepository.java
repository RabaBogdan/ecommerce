package com.example.ecommerceapp.repositories;

import com.example.ecommerceapp.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<ProductCategory, Long> {
    ProductCategory findById(long id);
}
