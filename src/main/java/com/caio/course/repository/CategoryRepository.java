package com.caio.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.course.entities.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{
     
}
