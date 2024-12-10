package com.inventoryapp.inventory.application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContinueController {

    @GetMapping("/")
    public String home(){
        return "Witaj w aplikacji, zalogowałeś się poprawnie";
    }
}
