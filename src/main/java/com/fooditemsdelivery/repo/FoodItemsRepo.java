package com.fooditemsdelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fooditemsdelivery.model.FoodItems;

@Repository
public interface FoodItemsRepo extends JpaRepository<FoodItems, Integer> {

}
