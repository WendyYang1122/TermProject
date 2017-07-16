package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Order;

public interface OrderMapper {

	List<Order> findAll(@Param("username")String username);
	
	public void addOrder(Order order);
	
	List<Order> bgFindAll(Order order);
	
	public void updateOrder(Order order);
}
