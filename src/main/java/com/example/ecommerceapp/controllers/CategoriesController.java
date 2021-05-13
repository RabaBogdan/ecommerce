package com.example.ecommerceapp.controllers;

import com.example.ecommerceapp.entities.ProductCategory;
import com.example.ecommerceapp.services.CategoriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CategoriesController {

    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/categories")
    public List<ProductCategory> findAllCategories() {
        return categoriesService.findAllCategories();
    }

    @GetMapping("/categories/{id}")
    public ProductCategory findById(@PathVariable("id") long id) {
        return  categoriesService.findById(id);
    }
    @PostMapping("/categories")
    public ProductCategory save(@RequestBody ProductCategory productCategory) {
        return categoriesService.saveCategories(productCategory);
    }
}
