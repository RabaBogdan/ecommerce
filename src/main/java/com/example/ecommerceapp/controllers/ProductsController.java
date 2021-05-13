
package com.example.ecommerceapp.controllers;

import com.example.ecommerceapp.entities.Products;
import com.example.ecommerceapp.services.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("api/v1/products")
    List<Products> findAllCategories(){
        return (List<Products>) productsService.findAllProducts();
    }

    @GetMapping("/api/v1/products/{id}")
    public Products findById(@PathVariable("id") long id){
        return productsService.findById(id);
    }

    @PostMapping("/api/v1/products")
    public Products save(@RequestBody Products products) {
        return productsService.saveProducts(products);
    }
}
