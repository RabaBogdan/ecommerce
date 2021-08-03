package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
