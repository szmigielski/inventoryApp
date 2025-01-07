package com.inventoryapp.inventory.application.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ContinueController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("username", user.getUsername());
        return "home";
    }
}
