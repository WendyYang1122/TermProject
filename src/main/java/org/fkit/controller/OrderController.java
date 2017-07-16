package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.domain.Goods;
import org.fkit.domain.Order;
import org.fkit.domain.User;
import org.fkit.service.CartService;
import org.fkit.service.GoodsService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	//展示订单页面
	@RequestMapping(value="/showOrder")
	 public String main(String username,Model model,String messageR){
		List<Order> order_list= orderService.getAll(username);
		model.addAttribute("messageR",messageR);
		// 将cart对象设置到Model作用范围域
		model.addAttribute("order_list", order_list);
		return "order";
	}
	
	//生成订单（添加购物车商品到订单，修改库存和销量）
	@RequestMapping(value="/addOrder")
	 public String main(@ModelAttribute Order order,@ModelAttribute Cart cart,String username,Model model){
		orderService.addOrder(order);
		cartService.deleteCart(cart);	
		Goods goods=order.getGoods();
		int id=goods.getId();
		List<Goods> goods_list=goodsService.findGoodsForOrder(id);
		int i;
		for(i=0;i<goods_list.size();i++){
			goods=goods_list.get(i);
			goods.setInventory(goods.getInventory()-1);
			goods.setSales(goods.getSales()+1);
			goods_list.set(i, goods);
			goodsService.updateGoods(goods);
		}
//		goods.setInventory(goods.getInventory()-1);
//		goods.setSales(goods.getSales()+1);
//		goodsService.updateGoods(goods_list);
		return "redirect:/showOrder?username="+username;
	}
	
	//后台订单管理页面
	@RequestMapping(value="/bgshowOrder")
	 public String main0(@ModelAttribute Order order,Model model){
		List<Order> order_list= orderService.bgFindAll(order);
		// 将cart对象设置到Model作用范围域
		model.addAttribute("order_list", order_list);
		return "bgOrder";
	}
	
	//后台修改订单状态
	@RequestMapping(value="/updateOrder")
	 public String main1(@ModelAttribute Order order,Model model){
		orderService.updateOrder(order);
		model.addAttribute("order",order);
		return "redirect:/bgshowOrder";
	}
	
	
}
