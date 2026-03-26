package com.maarten.FoodTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getuser")
    public User getuser(@RequestParam Long userID) {


        return userService.getUserById(userID);
    }

    @GetMapping("/userstats/{userID}")
    public int[] getfoodgoals(@PathVariable Long userID) {
        User user = userService.getUserById(userID);

        return new int[] {
            user.getCaloriesGoal(),
            user.getProteinGoal(),
            user.getCarbGoal(),
            user.getFatGoal()
        };
    }
}
