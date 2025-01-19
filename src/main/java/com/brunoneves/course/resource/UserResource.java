package com.brunoneves.course.resource;

import com.brunoneves.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "teste", "teste@gmail.com", "65999995544", "123456");
        return ResponseEntity.ok().body(u);
    }
}
