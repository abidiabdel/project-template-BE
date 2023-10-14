package com.template.ProjectTemplate.repository;

import com.template.ProjectTemplate.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
