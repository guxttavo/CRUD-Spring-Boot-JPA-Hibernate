package com.example.demo.resources;

import com.example.demo.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {


    @GetMapping
    public ResponseEntity<Users> findAll() {
        Users u = new Users(1L, "gustavo", "gus@gus", "1111", "1233");
        return ResponseEntity.ok().body(u);
    }
}
