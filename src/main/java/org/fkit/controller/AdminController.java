package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Admin;
import org.fkit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {

	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	
	@RequestMapping(value="/adLogin")
	 public ModelAndView login(
			 String name,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		Admin admin = adminService.login(name, password);
		if(admin != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("admin", admin);
			// 转发到main请求
			mv.setView(new RedirectView("background"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "账户名或密码错误，请重新输入!");
			mv.setViewName("adminLogin");
		}
		return mv;
	}
}
