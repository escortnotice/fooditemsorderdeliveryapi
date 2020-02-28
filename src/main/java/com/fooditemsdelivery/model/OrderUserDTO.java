package com.fooditemsdelivery.model;

import java.util.List;

public class OrderUserDTO {
	
	private List<Integer> itemids;
	
	private User user;
	
	//setters and getters
	public List<Integer> getItemids() {
		return itemids;
	}
	public void setItemids(List<Integer> itemids) {
		this.itemids = itemids;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
