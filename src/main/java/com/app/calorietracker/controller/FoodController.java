package com.app.calorietracker.controller;
import com.app.calorietracker.model.Food;
import com.app.calorietracker.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {
    @Autowired
    private FoodService service;

    @GetMapping
    public List<Food> getAllFoods() {
        return service.getAllFoods();
    }

    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return service.getFoodById(id);
    }

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return service.createFood(food);
    }

    @PutMapping("/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food food) {
        return service.updateFood(id, food);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable Long id) {
        service.deleteFood(id);
        return ResponseEntity.ok().build();
    }
}
