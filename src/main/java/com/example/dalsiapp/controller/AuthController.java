package com.example.dalsiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getLoginPage() { //metoda ktera vykresluje sablonu (html)
        return "login";
    }

    @PostMapping("/login")
    public String login() { //metoda ktera zpracovava data z formulare
        return "redirect:/login"; //toto je potreba upravit
    }
}
