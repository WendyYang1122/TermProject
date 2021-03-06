package org.fkit.domain;

import java.io.Serializable;

public class Favorite implements Serializable {
	private int id;
	private Goods goods;
	private User user;
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
//	private int goodId;
//	private int userId;
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
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
//	@Override
//	public String toString() {
//		return "Favorite [id=" + id + ", goodId=" + goodId + ", userId=" + userId + "]";
//	}
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", goods=" + goods + ", user=" + user + "]";
	}
}
