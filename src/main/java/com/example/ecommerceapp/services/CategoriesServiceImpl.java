package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.ProductCategory;
import com.example.ecommerceapp.repositories.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements  CategoriesService {

   private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }



    @Override
    public List<ProductCategory> findAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public ProductCategory saveCategories(ProductCategory productCategory) {
        return (ProductCategory) categoriesRepository.save(productCategory);
    }

    @Override
    public ProductCategory findById(long id) {
        return categoriesRepository.findById(id);
    }
}
