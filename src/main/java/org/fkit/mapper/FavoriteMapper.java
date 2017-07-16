package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Favorite;

public interface FavoriteMapper {
//	@Select("select * from tb_favorite,tb_goods,tb_user where tb_cart.user_id=tb_user.id and  tb_cart.goods_id=tb_goods.id and username=#{username}")
	List<Favorite> findAll(@Param("username")String username);
	
	public void addFavorite(Favorite favorite);

	public void deleteFavorite(Favorite favorite); 
	
	Favorite confirmFavorite(Favorite favorite); 
}
