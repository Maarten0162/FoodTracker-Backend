package com.maarten.FoodTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maarten.FoodTracker.model.Food;
import com.maarten.FoodTracker.service.FoodService;

@RestController
@RequestMapping("/api")
public class FoodController {

    private final FoodService foodService;



    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/food")
    public Food food(@RequestParam Long foodID) {
        return foodService.getFoodById(foodID);
    }
}