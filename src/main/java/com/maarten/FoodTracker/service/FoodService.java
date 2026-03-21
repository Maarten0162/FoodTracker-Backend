package com.maarten.FoodTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maarten.FoodTracker.model.Food;
import com.maarten.FoodTracker.repository.FoodRepository;

import lombok.NonNull;

@Service
public class FoodService {
    
    private final FoodRepository FoodRepo;

    public FoodService(FoodRepository FoodRepo) {
        this.FoodRepo = FoodRepo;
    }

    public List<Food> getAll() {

        List<Food> foodList = FoodRepo.findAll();

        return foodList;
    }

    public Food getFoodById(@NonNull Long foodId) {

        Food food = FoodRepo.findById(foodId).orElseThrow(() -> new RuntimeException("Food not found"));

        return food;
    }

    public Food createFood(@NonNull Food foodObj) {

        if (foodObj.getName() == null || foodObj.getName().isBlank()) {

            throw new IllegalArgumentException("Food name cannot be empty");
        }

        Food food = FoodRepo.save(foodObj);

        return food;
    }

    public Food updateFood(@NonNull Long foodId, @NonNull Food foodObj) {

        foodObj.setId(foodId); //jpa doet UPDATE als het obj een ID heeft anders is het INSERT

        Food food = FoodRepo.save(foodObj);

        return food;
    }

    public boolean deleteFood(@NonNull Long foodId) {

        FoodRepo.deleteById(foodId);
        return (!FoodRepo.existsById(foodId)); //returns true if it delete succesfully
    }
}
