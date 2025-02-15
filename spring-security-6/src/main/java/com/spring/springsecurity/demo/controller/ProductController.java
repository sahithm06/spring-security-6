package com.spring.springsecurity.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PostExchange;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/product")
public class ProductController {


    private record Product(Integer productId,
                           String productName,
                           double price){}
    List<Product> products = new ArrayList<>(
            List.of(new Product(1, "pixel6a",599.99),
                    new Product(1 ,"Mac pro", 1099.99)
            )
    );

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping
    public Product saveproduct(@RequestBody Product product){
        products.add(product);
        return product;
    }

}

