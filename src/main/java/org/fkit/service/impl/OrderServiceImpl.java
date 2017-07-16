package org.fkit.service.impl;


import java.util.List;

import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Order> getAll(String username){
		return orderMapper.findAll(username);
	}
	
	//addOrder方法的实现
	@Override
	public void addOrder(Order order){
		orderMapper.addOrder(order);
	}
	
	//bgFindAll方法的实现
	@Override
	public List<Order> bgFindAll(Order order){
		return orderMapper.bgFindAll(order);
	}
	
	//updateOrder方法的实现
	@Override
	public void updateOrder(Order order){
		orderMapper.updateOrder(order);
	}
}
