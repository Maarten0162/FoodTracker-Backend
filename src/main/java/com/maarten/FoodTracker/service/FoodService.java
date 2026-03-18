package com.maarten.FoodTracker.service;

import org.springframework.stereotype.Service;

import com.maarten.FoodTracker.model.Food;
import com.maarten.FoodTracker.repository.FoodRepository;

@Service
public class FoodService {
    
    private final FoodRepository FoodRepo;

    public FoodService(FoodRepository FoodRepo) {
        this.FoodRepo = FoodRepo;
    }

    public Food getFoodById(Long FoodID) {

        Food food = FoodRepo.findById(FoodID).orElseThrow(() -> new RuntimeException("Food not found"));

        return food;
    }
}
