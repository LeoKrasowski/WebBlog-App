package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "index"; // This will resolve to index.html in templates directory
    }
    
    @GetMapping("/support")
    public String support(Model model) {
    	model.addAttribute("message", "Support");
    	return "support";
    }
    
}
