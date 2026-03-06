package com.maarten.FoodTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FoodController {

    @GetMapping("/food")
    public int food() {
        return 50;
    }
}