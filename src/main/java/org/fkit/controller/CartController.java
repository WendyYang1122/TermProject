package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Favorite;
import org.fkit.domain.Goods;
import org.fkit.domain.User;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CartController {
	
	@Autowired
	@Qualifier("cartService")
	
	private CartService cartService;
	
	@RequestMapping(value="/showCart")
	 public String main(String username,Model model){
		List<Cart> cart_list= cartService.getAll(username);
		// 将cart对象设置到Model作用范围域
		model.addAttribute("cart_list", cart_list);
		return "cart";
	}
	
	@RequestMapping(value="/addCart")
	 public String main(@ModelAttribute Cart cart,String username,Model model){
		Cart confirmcart= cartService.confirmCart(cart);
		if(confirmcart != null){
			//商品已存在购物车
			int number=confirmcart.getNumber();
			cart.setNumber(number+1);
			cart.setId(confirmcart.getId());
			cartService.updateCart(cart);
			return "redirect:/showCart?username="+username;
		}else{
			//订单尚未评论，调用addReviews方法
			cartService.addCart(cart);
			model.addAttribute("cart", cart);
			return "redirect:/showCart?username="+username;
		}
	}
	
//	@RequestMapping(value="/addFavorite")
//	public String main1(@ModelAttribute Favorite favorite,Model model,String username){
//		Favorite confirmfavorite= favoriteService.confirmFavorite(favorite);
//		if(confirmfavorite != null){
//			//订单已评论
//			model.addAttribute("messageF", "您已收藏过此商品。");
//			return "redirect:/showMain?username="+username;
//		}else{
//			//订单尚未评论，调用addReviews方法
//			favoriteService.addFavorite(favorite);
//			model.addAttribute("favorite", favorite);
//			return "redirect:/showFavorite?username="+username;
//		}
//	}
	
	@RequestMapping(value="/deleteCart")
	 public String main1(@ModelAttribute Cart cart,String username,
			 Model model){
		cartService.deleteCart(cart);
		model.addAttribute("cart",cart);
		return "redirect:/showCart?username="+username;
	}
	
 	
	@RequestMapping(value="/updateCart")
	 public ModelAndView updateCart(
			 String flag,@ModelAttribute Cart cart,
			 ModelAndView mv,HttpSession session){
			session.setAttribute("cart", cart);
			User user=cart.getUser();
			String username=user.getUsername();
			cartService.updateCart(cart);
			mv.setView(new RedirectView("showCart?username="+username));
		return mv;
	}
	
}

