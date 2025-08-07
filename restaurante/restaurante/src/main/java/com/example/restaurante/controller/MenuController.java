package com.example.restaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @GetMapping("/first")
    public String myfirstMenu(){
        return "Your first Menu";
    }
}
