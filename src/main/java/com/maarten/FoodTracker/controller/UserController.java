package com.maarten.FoodTracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maarten.FoodTracker.model.User;
import com.maarten.FoodTracker.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;



    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userstats")
    public int[] food() {
        List<User> list = userService.getAllUsers();

        return new int[] {list.get(0).getCaloriesGoal(), list.get(0).getProteinGoal(), list.get(0).getCarbGoal(), list.get(0).getFatGoal()};
    }
}
