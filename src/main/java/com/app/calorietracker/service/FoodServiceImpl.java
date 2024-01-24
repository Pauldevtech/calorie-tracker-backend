package com.app.calorietracker.service;

import com.app.calorietracker.model.Food;
import com.app.calorietracker.repository.FoodRepository;
import com.app.calorietracker.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    private FoodRepository repository;

    @Autowired
    public void setRepository(FoodRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Food> getAllFoods() {
        return (List<Food>) repository.findAll();
    }

    @Override
    public Food getFoodById(Long id) {
        Optional<Food> optionalFood = repository.findById(id);
        if (!optionalFood.isPresent()) {
            throw new IllegalArgumentException("Food with id " + id + " not found");
        }
        return optionalFood.get();}

    @Override
    public Food createFood(Food food) {
        return repository.save(food);
    }

    @Override
    public Food updateFood(Long id, Food foodDetails) {
        Food food = getFoodById(id);
        food.setFoodName(foodDetails.getFoodName());
        food.setCalories(foodDetails.getCalories());
        food.setProtein(foodDetails.getProtein());
        food.setCarbohydrates(foodDetails.getCarbohydrates());
        food.setFats(foodDetails.getFats());
        return repository.save(food);
    }


    @Override
    public void deleteFood(Long id) {
        Food food = getFoodById(id);
        repository.delete(food);
    }
}