package com.example.HotelBusiness.controllers;


import com.example.HotelBusiness.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository UserRepository;

    @GetMapping("/")
    public String first( Model model) {
        return "homePage";
    }

    @GetMapping("/requests")
    public String req( Model model) {
        return "requests";
    }

}