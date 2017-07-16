package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Goods;

public interface GoodsMapper {

	@Select(" select * from tb_goods ")
	List<Goods> findAll();
	
	@Select(" select * from tb_goods where type = #{type}")
	List<Goods> findType(@Param(value = "type") String type);
	
	@Delete("delete FROM tb_goods WHERE id=#{id}")
	public void deleteGoods(Goods goods);
	
	@Update("update tb_goods set name= #{name},price= #{price} ,type= #{type},image= #{image}, inventory= #{inventory} ,sales=#{sales} where id = #{id}")
	public void updateGoods(Goods goods);
	
	@Insert("insert into tb_goods(name,price,type,image,inventory) values (#{name},#{price},#{type},#{image},#{inventory}) ")
	public void addGoods(Goods goods);

	@Select(" select * from tb_goods where id = #{id}")
	List<Goods> findGoodsForOrder(@Param(value = "id") int id);
}
