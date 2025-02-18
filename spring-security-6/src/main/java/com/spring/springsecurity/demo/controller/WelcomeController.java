package com.spring.springsecurity.demo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("")
    public String welcome(){
        return "Welcome to My Spring Security 6"; //
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
       return (CsrfToken) request.getAttribute("_csrf");
    }

}
