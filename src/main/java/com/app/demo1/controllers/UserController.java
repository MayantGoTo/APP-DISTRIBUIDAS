package com.app.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("name", "Mayant");
        model.addAttribute("lastname", "Gorgonio Tolentino");
        return "details";
    }

}
