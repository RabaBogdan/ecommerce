package com.example.ecommerceapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "product_category")
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long categoriesId;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "product_category", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Products> productsList;


}
