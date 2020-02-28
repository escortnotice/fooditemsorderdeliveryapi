package com.fooditemsdelivery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fooditemsdelivery.model.OrderFoodItems;



@Repository
public interface OrdersRepo extends JpaRepository<OrderFoodItems, Integer> {

	
	List<OrderFoodItems> findByOrderid(int id);
}
