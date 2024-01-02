package com.pharma.PharmaConnect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.PharmaConnect.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
} 
