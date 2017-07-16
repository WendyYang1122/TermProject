package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
	
	// 自动注入UserService
	@Autowired
	@Qualifier("userService")
	private UserService userService;
		
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String email,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(email, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("showMain"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "邮箱或密码错误，请重新输入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/addUser")
	 public ModelAndView addUser(
			 String flag,@ModelAttribute User user,
			 ModelAndView mv){
			userService.addUser(user);
			mv.setViewName("loginForm");
		return mv;
	}
	
	@RequestMapping(value="/FindPassword")
	 public ModelAndView findPassword(
			 String email,String username,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和用户名查找密码，判断信息是否正确
		User user = userService.findPassword(email, username);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.addObject("message1", "您的密码是：");
			mv.setViewName("findPassword");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "邮箱或用户名错误，请重新输入!");
			mv.setViewName("findPassword");
		}
		return mv;
	}
	
	@RequestMapping(value="/updateUser")
	 public String main2(@ModelAttribute User user,
			 Model model){
		userService.updateUser(user);
		model.addAttribute("message","修改密码成功，请重新登录。");
		return "loginForm";
	}
}
