package com.example.course_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam(required = false) String login, Model model){
        System.out.println("login = " + login);
        model.addAttribute("login", login);
        return "home_page";
    }
}
