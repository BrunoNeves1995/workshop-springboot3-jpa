package com.brunoneves.course.services;

import com.brunoneves.course.entities.User;
import com.brunoneves.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Registra um serviço na camada de serviço
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
      Optional<User> user = userRepository.findById(id);
      return user.get();
    }

}
