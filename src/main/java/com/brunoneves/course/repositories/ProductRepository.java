package com.brunoneves.course.repositories;

import com.brunoneves.course.entities.Category;
import com.brunoneves.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
