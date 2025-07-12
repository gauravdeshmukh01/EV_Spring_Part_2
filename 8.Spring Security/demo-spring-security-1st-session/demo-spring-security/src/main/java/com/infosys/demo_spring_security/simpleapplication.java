package com.infosys.demo_spring_security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleapplication {

    @GetMapping("/")
    public String Home(HttpServletRequest request){
        return "Welcome to spring security session!" + request.getSession().getId();
    }
}
