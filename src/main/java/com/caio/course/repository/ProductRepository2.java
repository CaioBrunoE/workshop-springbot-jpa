package com.caio.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.course.entities.Product;

@Repository
public interface ProductRepository2 extends JpaRepository<Product, Long>{
     
}