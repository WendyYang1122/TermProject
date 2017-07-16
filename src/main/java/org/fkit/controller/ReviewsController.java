package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Reviews;
import org.fkit.domain.User;
import org.fkit.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReviewsController {

	@Autowired
	@Qualifier("reviewsService")
	private ReviewsService reviewsService;
	
	
	@RequestMapping(value="/addReviews")
	 public ModelAndView login(
			 Reviews reviews,String username,
			 ModelAndView mv,
			 HttpSession session){
		// 根据订单号order_id,调用 findOrderId方法查找评论，判断是否已经评论过
		Reviews findorderid= reviewsService.findOrderId(reviews);
		if(findorderid != null){
			//订单已评论
			mv.addObject("messageR", "您已评论过此商品。");
			mv.setView(new RedirectView("showOrder?username="+username));
		}else{
			//订单尚未评论，调用addReviews方法
			reviewsService.addReviews(reviews);
			session.setAttribute("reviews", reviews);
			mv.addObject("message", "谢谢评价！");
			mv.setView(new RedirectView("showOrder?username="+username));
		}
		return mv;
	}
	
	
//	@RequestMapping(value="/addReviews")
//	 public String main(@ModelAttribute Reviews reviews,String username, Model model){
//		reviewsService.addReviews(reviews);
//		model.addAttribute("reviews",reviews);
//		model.addAttribute("message","谢谢评价！");
//		return "redirect:/showOrder?username="+username;
//	}
}
