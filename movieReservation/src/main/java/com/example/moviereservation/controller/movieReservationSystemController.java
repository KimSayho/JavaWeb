package com.example.moviereservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class movieReservationSystemController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
