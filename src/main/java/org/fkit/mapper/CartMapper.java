package org.fkit.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Cart;

public interface CartMapper {
//	@Select("select * from tb_cart,tb_goods,tb_user where tb_cart.user_id=tb_user.id and  tb_cart.goods_id=tb_goods.id and username=#{username}")
	List<Cart> findAll(@Param("username")String username);
	
//	@Insert("insert into tb_cart(user_id,goods_id,number) values (#{user.id},#{goods.id},1)")
//	@Options(useGeneratedKeys=true,keyProperty="id")
	public void addCart(Cart cart);
	
	Cart confirmCart(Cart cart); 

//	@Delete("delete FROM tb_cart WHERE user_id=#{user.id} and goods_id=#{goods.id}")
	public void deleteCart(Cart cart); 

	public void updateCart(Cart cart); 
	
	
}
