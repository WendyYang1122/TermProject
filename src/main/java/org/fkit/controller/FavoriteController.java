package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.domain.Favorite;
import org.fkit.domain.User;
import org.fkit.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class FavoriteController {

	@Autowired
	@Qualifier("favoriteService")
	
	private FavoriteService favoriteService;
	
	@RequestMapping(value="/showFavorite")
	 public String main(String username,Model model){
		List<Favorite> favorite_list= favoriteService.getAll(username);
		// 将goods对象设置到Model作用范围域
		model.addAttribute("favorite_list", favorite_list);
		return "favorite";
	}
	
	@RequestMapping(value="/addFavorite")
	public String main1(@ModelAttribute Favorite favorite,Model model,String username){
		Favorite confirmfavorite= favoriteService.confirmFavorite(favorite);
		if(confirmfavorite != null){
			//订单已评论
			model.addAttribute("messageF", "您已收藏过此商品。");
			return "redirect:/showMain?username="+username;
		}else{
			//订单尚未评论，调用addReviews方法
			favoriteService.addFavorite(favorite);
			model.addAttribute("favorite", favorite);
			return "redirect:/showFavorite?username="+username;
		}
	}
	
	
	@RequestMapping(value="/deleteFavorite")
	 public String main1(@ModelAttribute Favorite favorite,String username,
			 Model model){
		favoriteService.deleteFavorite(favorite);
		model.addAttribute("favorite",favorite);
		return "redirect:/showFavorite?username="+username;
	}
	
	
}
