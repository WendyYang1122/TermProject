package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	//展示购物车商品
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getAll(String username){
		return cartMapper.findAll(username);
	}
	
	//addCart方法的实现
	@Override
	public void addCart(Cart cart){
		cartMapper.addCart(cart);
	}
	
	//confirmCart方法的实现
	@Override
	public Cart confirmCart(Cart cart){
		return cartMapper.confirmCart(cart);
	}
	
	//deleteCart方法的实现
	@Override
	public void deleteCart(Cart cart){
		cartMapper.deleteCart(cart);
	}
	
	@Override
	public void updateCart(Cart cart){
		cartMapper.updateCart(cart);
	}
	
}
