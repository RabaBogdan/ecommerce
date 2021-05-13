package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.ProductCategory;

import java.util.List;

public interface CategoriesService {

    List<ProductCategory> findAllCategories();
    ProductCategory saveCategories(ProductCategory productCategory);
    ProductCategory findById (long id);
}
