package com.maarten.FoodTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maarten.FoodTracker.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
