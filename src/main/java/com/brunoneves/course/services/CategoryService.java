package com.brunoneves.course.services;

import com.brunoneves.course.entities.Category;
import com.brunoneves.course.entities.User;
import com.brunoneves.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Registra um serviço na camada de serviço
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
      return categoryRepository.findById(id).get();
    }

}
