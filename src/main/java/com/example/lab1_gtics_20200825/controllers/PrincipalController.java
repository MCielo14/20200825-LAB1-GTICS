package com.example.lab1_gtics_20200825.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class PrincipalController {
    @GetMapping(value = "/principal")
    public String principal() {
        return "principal";
    }
}
