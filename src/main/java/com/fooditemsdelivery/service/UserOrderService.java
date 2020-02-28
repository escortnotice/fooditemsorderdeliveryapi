package com.fooditemsdelivery.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooditemsdelivery.model.OrderFoodItems;
import com.fooditemsdelivery.model.OrderUser;
import com.fooditemsdelivery.model.OrderUserDTO;
import com.fooditemsdelivery.repo.OrderUserRepo;
import com.fooditemsdelivery.repo.OrdersRepo;

@Service
public class UserOrderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderService.class);

	@Autowired 
	OrdersRepo orderRepo;
	
	@Autowired
	OrderUserRepo orderUserRepo;
	
	@Transactional
	public OrderUser createOrders(OrderUserDTO orderUserDTO) {
		 int orderId =(int)(Math.random()*9000)+1000; //creates a 4 digit random number
		 LOGGER.info("orderId->{}",orderId);
		List<OrderFoodItems> orderList= new ArrayList<>();
		for(int i=0;i<orderUserDTO.getItemids().size();i++)
		{
			OrderFoodItems order = new OrderFoodItems();
			order.setOrderid(orderId);
			order.setItemid(orderUserDTO.getItemids().get(i));
			orderList.add(order);
			
			
		}
		LOGGER.info("Order List: {}",orderList.toArray());
		orderRepo.saveAll(orderList);
		
		OrderUser orderuser = new OrderUser();
		orderuser.setUsername(orderUserDTO.getUser().getUsername());
		orderuser.setUseraddress(orderUserDTO.getUser().getAddress());
		orderuser.setUseremail(orderUserDTO.getUser().getEmail());
	
		orderuser.setOrderid(orderId);
		LOGGER.info("User Details: {}", orderuser);
		return orderUserRepo.save(orderuser); 
	}

	public List<OrderFoodItems> getOrderDetails(int orderid) {
	
		return orderRepo.findByOrderid(orderid);
		
	}

	public OrderUser getOrderUserDetails(int orderid) {
		return orderUserRepo.findById(orderid).get();
	}
	
	
	

}
