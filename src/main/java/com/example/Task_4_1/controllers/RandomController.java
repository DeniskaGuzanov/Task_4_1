package com.example.Task_4_1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping("/random")
    public String getRandomNumber(Model model){
        model.addAttribute("number", new Random().nextInt(101));
        return "random";
    }
}
