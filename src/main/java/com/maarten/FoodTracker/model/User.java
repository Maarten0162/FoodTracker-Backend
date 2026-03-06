package com.maarten.FoodTracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "caloriegoal")
    private int caloriesGoal;

    @Column(name = "proteingoal")
    private int proteinGoal;

    @Column(name = "carbgoal")
    private int carbGoal;

    @Column(name = "fatgoal")
    private int fatGoal;

}