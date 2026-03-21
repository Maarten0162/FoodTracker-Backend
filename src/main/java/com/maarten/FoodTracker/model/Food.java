package com.maarten.FoodTracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 50)
    private String barcode;

    @Column(name = "serving_size", nullable = false)
    private double servingSize;

    @Column(name = "calories_per_100g", nullable = false)
    private double caloriesPer100g;

    @Column(name = "fat_per_100g", nullable = false)
    private double fatPer100g;

    @Column(name = "carbs_per_100g", nullable = false)
    private double carbsPer100g;

    @Column(name = "protein_per_100g", nullable = false)
    private double proteinPer100g;

    // Constructors
    public Food() {}

    public Food(String name, String description, String barcode, double servingSize,
                double caloriesPer100g, double fatPer100g, double carbsPer100g, double proteinPer100g) {
        this.name = name;
        this.description = description;
        this.barcode = barcode;
        this.servingSize = servingSize;
        this.caloriesPer100g = caloriesPer100g;
        this.fatPer100g = fatPer100g;
        this.carbsPer100g = carbsPer100g;
        this.proteinPer100g = proteinPer100g;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public double getServingSize() { return servingSize; }
    public void setServingSize(double servingSize) { this.servingSize = servingSize; }

    public double getCaloriesPer100g() { return caloriesPer100g; }
    public void setCaloriesPer100g(double caloriesPer100g) { this.caloriesPer100g = caloriesPer100g; }

    public double getFatPer100g() { return fatPer100g; }
    public void setFatPer100g(double fatPer100g) { this.fatPer100g = fatPer100g; }

    public double getCarbsPer100g() { return carbsPer100g; }
    public void setCarbsPer100g(double carbsPer100g) { this.carbsPer100g = carbsPer100g; }

    public double getProteinPer100g() { return proteinPer100g; }
    public void setProteinPer100g(double proteinPer100g) { this.proteinPer100g = proteinPer100g; }
}