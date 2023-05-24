package com.example.dalsiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//localhost:8080/markets

@Controller
public class MarketController { //1

    @GetMapping("/")
    public String index(){ //aby vracel markets kdyz napisu jen localhost:8080
        return "redirect:/markets";
    }
    @GetMapping("/markets")
    public String getMarketPage() {
        return "markets";
    }
}
