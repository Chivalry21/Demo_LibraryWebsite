package com.example.demo_schoolwebsite.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class AuthController {

        @GetMapping("/login")
        public String login() {

            return "auth/login";
        }

        @GetMapping("/register")
        public String register() {

            return "auth/register";
        }


    }


