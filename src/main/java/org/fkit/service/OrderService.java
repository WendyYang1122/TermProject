package org.fkit.service;

import java.util.List;

import org.fkit.domain.Order;

public interface OrderService {
	//查询用户订单所有商品
	List<Order> getAll(String username);
	//添加订单
	void addOrder(Order order);
	//后台查询商城所有订单
	List<Order> bgFindAll(Order order);
	//修改订单状态
	void updateOrder(Order order);
}
