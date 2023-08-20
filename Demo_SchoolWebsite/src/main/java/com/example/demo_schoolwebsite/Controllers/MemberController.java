package com.example.demo_schoolwebsite.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public class MemberController {
    public String ListMember(Model model){
        return "Member/list";
    }

    public String NumberDetails(@PathVariable long id, Model model){
        return "Members/details";
    }
}
