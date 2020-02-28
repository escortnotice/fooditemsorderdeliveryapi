package com.fooditemsdelivery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name = "order_user")
public class OrderUser {

	@Id
	int orderid;
	
	String username;
	
	String useraddress;
	
	String useremail;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderdatetime", nullable = false, updatable = false)
    @CreationTimestamp
    private Date orderdatetime;
	
	boolean order_received;
	
	boolean order_accepted;
	
	boolean order_outfordelivery;
	
	boolean order_delivered;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderdelivereddatetime", nullable = true)
    private Date orderdelivereddatetime;

	
	//setters and getters
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public Date getOrderdatetime() {
		return orderdatetime;
	}

	public void setOrderdatetime(Date orderdatetime) {
		this.orderdatetime = orderdatetime;
	}

	public boolean isOrder_received() {
		return order_received;
	}

	public void setOrder_received(boolean order_received) {
		this.order_received = order_received;
	}

	public boolean isOrder_accepted() {
		return order_accepted;
	}

	public void setOrder_accepted(boolean order_accepted) {
		this.order_accepted = order_accepted;
	}

	public boolean isOrder_outfordelivery() {
		return order_outfordelivery;
	}

	public void setOrder_outfordelivery(boolean order_outfordelivery) {
		this.order_outfordelivery = order_outfordelivery;
	}

	public boolean isOrder_delivered() {
		return order_delivered;
	}

	public void setOrder_delivered(boolean order_delivered) {
		this.order_delivered = order_delivered;
	}

	public Date getOrderdelivereddatetime() {
		return orderdelivereddatetime;
	}

	public void setOrderdelivereddatetime(Date orderdelivereddatetime) {
		this.orderdelivereddatetime = orderdelivereddatetime;
	}

	@Override
	public String toString() {
		return "OrderUser [orderid=" + orderid + ", username=" + username + ", useraddress=" + useraddress
				+ ", useremail=" + useremail + ", orderdatetime=" + orderdatetime + ", order_received=" + order_received
				+ ", order_accepted=" + order_accepted + ", order_outfordelivery=" + order_outfordelivery
				+ ", order_delivered=" + order_delivered + ", orderdelivereddatetime=" + orderdelivereddatetime + "]";
	}

	
	
}
