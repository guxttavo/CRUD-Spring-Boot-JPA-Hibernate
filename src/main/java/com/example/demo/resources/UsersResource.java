package com.example.demo.resources;

import com.example.demo.entities.Users;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<Users>> findAll() {
        List<Users> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id) {
        Users obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
