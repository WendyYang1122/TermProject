package org.fkit.service;

import java.util.List;

import org.fkit.domain.Favorite;

public interface FavoriteService {
	List<Favorite> getAll(String username);
	
	void addFavorite(Favorite favorite);

	void deleteFavorite(Favorite favorite); 
	
	Favorite confirmFavorite(Favorite favorite); 
}
