package com.fooditemsdelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fooditemsdelivery.model.OrderUser;





@Repository
public interface OrderUserRepo extends JpaRepository<OrderUser, Integer> {

}
