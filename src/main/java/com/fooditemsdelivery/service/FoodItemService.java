package com.fooditemsdelivery.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooditemsdelivery.model.FoodItems;
import com.fooditemsdelivery.repo.FoodItemsRepo;

@Service
public class FoodItemService {

	private static final Logger LOGGER = LoggerFactory.getLogger(FoodItemService.class);

	@Autowired
	FoodItemsRepo foodItemsRepo;
	
	
	public FoodItems createFoodItems(FoodItems items)
	{
		LOGGER.info("Creating Food Items: {}", items);
		return foodItemsRepo.save(items);
	}


	public FoodItems getFooditems(int id) {
		return foodItemsRepo.findById(id).get();
		
	}


	public java.util.List<FoodItems> getAllFooditems() {
		// TODO Auto-generated method stub
		return foodItemsRepo.findAll();
	}
}
