package com.fooditemsdelivery.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fooditems")
public class FoodItems {

	@Id
	int id;
	
	String name;
	
	String itemtype;
	
	String description;
	
	String img_src;
	
	String category;
	
	Double price;
	
	//setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "FoodItems [id=" + id + ", name=" + name + ", itemtype=" + itemtype + ", description=" + description
				+ ", img_src=" + img_src + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	
}
