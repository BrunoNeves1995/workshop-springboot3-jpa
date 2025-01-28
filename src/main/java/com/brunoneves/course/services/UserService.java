package com.brunoneves.course.services;

import com.brunoneves.course.DTO.UserDTO;
import com.brunoneves.course.entities.User;
import com.brunoneves.course.repositories.UserRepository;
import com.brunoneves.course.services.exceptions.DatabaseException;
import com.brunoneves.course.services.exceptions.ResourceNotFoundException;
import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

//Registra um serviço na camada de serviço
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try {
            User user = findById(id);
            userRepository.delete(user);
        } catch (DataIntegrityViolationException  e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User user) {
        User enity = userRepository.getReferenceById(id);
        updateData(enity, user);
        return userRepository.save(enity);
    }

    private void updateData(User enity, User user) {
        enity.setName(user.getName());
        enity.setEmail(user.getEmail());
        enity.setPhone(user.getPhone());
    }

}
