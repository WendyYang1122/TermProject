package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Goods;
import org.fkit.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	
	@RequestMapping(value="/showIndex")
	 public String main(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到mainNologin页面
		return "mainNologin";
	}
	
	@RequestMapping(value="/showMain")
	 public String main1(Model model,String messageF){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		//提示收藏夹重复收藏信息
		model.addAttribute("messageF", messageF);
		// 跳转到mainNologin页面
		return "mainPage";
	}
	
	@RequestMapping(value="/showType")
	 public String main(String type,Model model){
		// 根据商品类别查询商品
		
		List<Goods> goods_list= goodsService.getType(type);
		// 将goods对象设置到Model作用范围域
		model.addAttribute("goods_list", goods_list);
		// 跳转到category页面
		return "category";
	}
	
	@RequestMapping(value="/deleteGoods")
	 public String main1(@ModelAttribute Goods goods,
			 Model model){
		goodsService.deleteGoods(goods);
		model.addAttribute("goods",goods);
		return "redirect:/bgshowGoods";
	}
	
	@RequestMapping(value="/bgshowGoods")
	 public String main2(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到mainNologin页面
		return "bgGoods";
	}
	
	@RequestMapping(value="/updateGoods")
	 public String main2(@ModelAttribute Goods goods,
			 Model model){
		goodsService.updateGoods(goods);
		model.addAttribute("goods",goods);
		return "redirect:/bgshowGoods";
	}
	
	@RequestMapping(value="/addGoods")
	 public String main(@ModelAttribute Goods goods,Model model){
		goodsService.addGoods(goods);
		model.addAttribute("goods",goods);
		model.addAttribute("message","商品已上架！");
		return "addbgGoods";
	}
	
	@RequestMapping(value="/showGoodsDetail")
	 public String main1(int id,Model model){
		// 根据id获得商品信息（其实传过来的就一个id啦）
		List<Goods> goods_list = goodsService.findGoodsForOrder(id);
		model.addAttribute("goods_list", goods_list);
		// 跳转到goodsDetail页面
		return "goodsDetail";
	}
	
}
