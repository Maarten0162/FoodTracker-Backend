package com.maarten.FoodTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maarten.FoodTracker.model.User;
import com.maarten.FoodTracker.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository UserRepo;

    public UserService(UserRepository userRepository) {
        this.UserRepo = userRepository;
    }

    public List<User> getAllUsers() {
        return UserRepo.findAll();
    }
}
