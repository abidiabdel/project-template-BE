package com.template.ProjectTemplate.controller;

import com.template.ProjectTemplate.model.Category;
import com.template.ProjectTemplate.model.Product;
import com.template.ProjectTemplate.repository.CategoryRepository;
import com.template.ProjectTemplate.repository.ProductRepository;
import com.template.ProjectTemplate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product")
public class ProductController {


    @Autowired
    ProductService productService;


    //todo complete save Methode 
    @PostMapping(path = "/save")
    public String createProduct(){

        return productService.createProduct();
    }
}
