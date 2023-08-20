package com.example.demo_schoolwebsite.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
public class BookController {
    @GetMapping("/")
    public String home(Model model){
        return "Index";
    }
@GetMapping("/books/{Id}")
    public String bookDetails(@PathVariable long Id, Model model) {
        return "bookDetails";
    }
}
