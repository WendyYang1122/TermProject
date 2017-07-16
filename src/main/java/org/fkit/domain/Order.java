package org.fkit.domain;

import java.io.Serializable;

public class Order implements Serializable  {
	private int id;
//	private int goodId;
//	private int userId;
	private String status; 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private int number;
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public int getGoodId() {
//		return goodId;
//	}
//	public void setGoodId(int goodId) {
//		this.goodId = goodId;
//	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", goodId=" + goodId + ", userId=" + userId + ", number=" + number + "]";
//	}
}

