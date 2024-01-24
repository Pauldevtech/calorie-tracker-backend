package com.app.calorietracker.repository;

import com.app.calorietracker.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
}
