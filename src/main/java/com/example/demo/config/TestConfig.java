package com.example.demo.config;

import com.example.demo.entities.Users;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsersRepository usersRepository;

    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Users u2 = new Users(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        usersRepository.saveAll(Arrays.asList(u1, u2));

    }
}
