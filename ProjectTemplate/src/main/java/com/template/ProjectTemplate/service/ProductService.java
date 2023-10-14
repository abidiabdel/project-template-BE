package com.template.ProjectTemplate.service;

import com.template.ProjectTemplate.model.Category;
import com.template.ProjectTemplate.model.Product;
import com.template.ProjectTemplate.repository.CategoryRepository;
import com.template.ProjectTemplate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;

    public String createProduct(){
        Product p = new Product();
        p.setName("product 1");
        p.setDescription("first product");
        Category k =new Category();
        k.setName("category 1 ");
        categoryRepository.save(k);
        p.setCategory(k);
        productRepository.save(p);
        return "hallo";
    }
}
