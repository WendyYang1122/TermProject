package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Favorite;
import org.fkit.mapper.FavoriteMapper;
import org.fkit.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
	
	@Autowired
	private FavoriteMapper favoriteMapper;
	
	//展示收藏夹商品
	@Transactional(readOnly=true)
	@Override
	public List<Favorite> getAll(String username){
		return favoriteMapper.findAll(username);
	}
	
	//addFavorite方法的实现
	@Override
	public void addFavorite(Favorite favorite){
		favoriteMapper.addFavorite(favorite);
	}
	
	//deleteFavorite方法的实现
	@Override
	public void deleteFavorite(Favorite favorite){
		favoriteMapper.deleteFavorite(favorite);
	}
	
	//confirmFavorite方法的实现
	@Override
	public Favorite confirmFavorite(Favorite favorite){
		return favoriteMapper.confirmFavorite(favorite);
	}
}
