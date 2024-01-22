package com.example.Task_4_1.services;


import com.example.Task_4_1.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getAllProducts(){
        return products;
    }



}
