
package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.Products;

import java.util.List;

public interface ProductsService {

    List<Products> findAllProducts();
    Products saveProducts (Products products);
    Products findById (long id);
}
