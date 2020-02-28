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

import com.fooditemsdelivery.model.OrderFoodItems;
import com.fooditemsdelivery.model.OrderUser;
import com.fooditemsdelivery.model.OrderUserDTO;
import com.fooditemsdelivery.service.UserOrderService;

@RestController
public class UserOrderController {

	@Autowired
	FoodItemsController foodItemsController;
	
	@Autowired
	UserOrderService userOrderService;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderController.class);

	
	@PostMapping("/orders")
	public OrderUser createOrders(@RequestBody OrderUserDTO orderUserDTO)
	{
		LOGGER.info("Creating a new order");
		return userOrderService.createOrders(orderUserDTO);
	}
	
	@GetMapping("/orders/{orderid}")
	public List<OrderFoodItems> getOrderDetails(@PathVariable int orderid)
	{
		return userOrderService.getOrderDetails(orderid);
		
	}
	
	@GetMapping("/userOrders/{orderid}")
	public OrderUser getOrderUserDetails(@PathVariable int orderid)
	{
		return userOrderService.getOrderUserDetails(orderid);
	}
}
