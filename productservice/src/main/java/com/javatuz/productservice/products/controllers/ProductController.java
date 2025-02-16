package com.javatuz.productservice.products.controllers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private static final Logger log = LogManager.getLogger(ProductController.class);

    @GetMapping
    public String getAllProducts(){
        log.info("Getting all products");
        return "All products";
    }
}
