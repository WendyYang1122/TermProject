package org.fkit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Goods;

public interface GoodsService {
	//查找所有商品
	List<Goods> getAll();
	//根据类别查询商品
	List<Goods> getType(String type);
	//后台删除商品
	void deleteGoods(Goods goods);
	//后台修改商品信息
	void updateGoods(Goods goods);
	//后台添加商品
	void addGoods(Goods goods);
	//订单生成时查找商品用来修改库存和销量
	List<Goods> findGoodsForOrder(int id);

}
