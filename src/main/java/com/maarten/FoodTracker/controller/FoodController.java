package com.maarten.FoodTracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.maarten.FoodTracker.model.Food;
import com.maarten.FoodTracker.service.FoodService;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    private final FoodService foodService;



    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/{id}")
    public Food getById(@PathVariable Long foodID) {
        return foodService.getFoodById(foodID);
    }

    @PostMapping
    public Food createFood(@RequestBody Food food) { 
        return foodService.createFood(food);
    }

    @PutExchange
    public Food updateFood(@RequestBody Long foodId, @RequestBody Food food) { 
        return foodService.updateFood(foodId, food);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long foodID) {
        return foodService.deleteFood(foodID);
    }
}