package com.brunoneves.course.services;

import com.brunoneves.course.entities.Product;
import com.brunoneves.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Registra um serviço na camada de serviço
@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll(){
        return ProductRepository.findAll();
    }

    public Product findById(Long id){
      return ProductRepository.findById(id).get();
    }

}
