package com.maarten.FoodTracker.service;

import org.springframework.stereotype.Service;

import com.maarten.FoodTracker.model.User;
import com.maarten.FoodTracker.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository UserRepo;

    public UserService(UserRepository userRepository) {
        this.UserRepo = userRepository;
    }

    public User getUserById(Long userID) {

        User user = UserRepo.findById(userID).orElseThrow(() -> new RuntimeException("User not found"));

        return user;
    }
}
