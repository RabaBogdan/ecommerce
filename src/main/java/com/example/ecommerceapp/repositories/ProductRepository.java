
package com.example.ecommerceapp.repositories;

import com.example.ecommerceapp.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
    Products findById(long id);
}
