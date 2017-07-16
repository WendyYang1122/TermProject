package org.fkit.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImplTest  extends BaseTest {

	@Autowired
	private CartService cartService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAll() {
		List<Cart> cart=cartService.getAll("111");
		System.out.println(cart);
	}

	@Test
	public void testAddCart() {
	}

	@Test
	public void testConfirmCart() {
		Cart cart=new Cart();
		Cart confirmcart=cartService.confirmCart(cart);
		if(confirmcart != null){
			//商品已存在购物车
			System.out.println("ConfirmCart 商品已存在");
		}else{
			//订单尚未评论，调用addReviews方法
			System.out.println("ConfirmCart 商品不存在");
		}
	}

	@Test
	public void testDeleteCart() {
		Cart cart=new Cart();
		cartService.deleteCart(cart);
		System.out.println("ConfirmCart");
	}

	@Test
	public void testUpdateCart() {
		Cart cart=new Cart();
		cartService.updateCart(cart);
		System.out.println("UpdateCart");
	}

}
