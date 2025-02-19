package com.spring.springsecurity.demo.controller;

import com.spring.springsecurity.demo.entity.User;
import com.spring.springsecurity.demo.repository.UserRepository;
import com.spring.springsecurity.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        //return userRepository.save(user);
        //return userRepository.save(user);
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.verify(user);
//        var u = userRepository.findByUserName(user.getUserName());
//        if(!Objects.isNull(u))
//            return "Success";
//        return "Failed";

    }


}