package org.fkit.service;

import org.fkit.domain.User;

public interface UserService {

	User login(String email,String password);
	void addUser(User user);
	User findPassword( String email,String username);
	void updateUser(User user);
}
