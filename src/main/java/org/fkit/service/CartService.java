package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;

public interface CartService {
	//查询购物车所有商品
	List<Cart> getAll(String username);
	//添加商品到购物车
	void addCart(Cart cart);
	//确认购物车是否已有此商品
	Cart confirmCart(Cart cart); 
	//删除购物车商品
	void deleteCart(Cart cart); 
	//修改购物车商品
	void updateCart(Cart cart);
}
