
package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.Products;
import com.example.ecommerceapp.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    private final ProductRepository productRepository;

    public ProductsServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Products> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products saveProducts(Products products) {
        return productRepository.save(products);
    }

    @Override
    public Products findById(long id) {
        return  productRepository.findById(id);
    }
}
