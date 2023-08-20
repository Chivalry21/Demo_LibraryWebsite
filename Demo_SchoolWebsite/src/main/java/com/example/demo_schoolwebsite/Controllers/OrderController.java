package com.example.demo_schoolwebsite.Controllers;

import com.example.demo_schoolwebsite.Models.Book;
import lombok.Builder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
    public class OrderController {

        @GetMapping("/orders")
        public String listOrders(Model model) {
            Book.builder().title("Journals").isbn(23).author("Chivlry").availability(false).build();
            Book book=new Book();
            return "orders/list";
        }

        @GetMapping("/orders/{id}")
        public String orderDetails(@PathVariable Long id, Model model) {

            return "orders/details";
        }


    }

