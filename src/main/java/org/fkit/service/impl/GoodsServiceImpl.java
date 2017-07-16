package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Goods;
import org.fkit.mapper.GoodsMapper;
import org.fkit.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		return goodsMapper.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getType(String type) {
		return goodsMapper.findType(type);
	}
	
	//deleteGoods方法的实现
	@Override
	public void deleteGoods(Goods goods){
		goodsMapper.deleteGoods(goods);
	}
	
	//updateGoods方法的实现
	@Override
	public void updateGoods(Goods goods){
		goodsMapper.updateGoods(goods);
	}
	
	//addGoods方法的实现
	@Override
	public void addGoods(Goods goods){
		goodsMapper.addGoods(goods);
	}
	
	//findGoodsForOrder方法的实现
	public List<Goods> findGoodsForOrder(int id){
		return goodsMapper.findGoodsForOrder(id);
	}
	
	
}
