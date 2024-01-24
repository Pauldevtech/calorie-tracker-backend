package com.app.calorietracker.service;

import com.app.calorietracker.model.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAllFoods();
    Food getFoodById(Long id);
    Food createFood(Food food);
    Food updateFood(Long id, Food food);
    void deleteFood(Long id);
}