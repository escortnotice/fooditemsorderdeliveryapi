package com.fooditemsdelivery.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fooditemsdelivery.model.FoodItems;
import com.fooditemsdelivery.service.FoodItemService;

@RestController
public class FoodItemsController {
	private static final Logger LOGGER = LoggerFactory.getLogger(FoodItemsController.class);

	
	@Autowired
	FoodItemService itemService;
	
	@PostMapping("/items")
	public FoodItems createFoodItems(@RequestBody FoodItems items)
	{
		LOGGER.info("creating Food Items: {}", items);
		return itemService.createFoodItems(items);
	}
	
	@GetMapping("/items/{id}")
	public FoodItems getFoodItems(@PathVariable int id)
	{
		return itemService.getFooditems(id);
	}
	
	@GetMapping("/items")
	public List<FoodItems> getAllFoodItems()
	{
		return itemService.getAllFooditems();
	}
	
	
}
