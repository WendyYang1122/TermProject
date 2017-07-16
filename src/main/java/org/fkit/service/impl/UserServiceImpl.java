package org.fkit.service.impl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;

import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
public class UserServiceImpl implements UserService{
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;
		
	//login方法实现
	@Transactional(readOnly=true)
	@Override
	public User login(String email,String password){
		return userMapper.findWithEmailAndPassword(email, password);
	}
	
	//addUser方法的实现
	@Override
	public void addUser(User user){
		userMapper.addUser(user);
	}
	
	@Override
	public User findPassword(String email,String username){
		return userMapper.findPassword(email,username);
	}
	
	@Override
	public void updateUser(User user){
		userMapper.updateUser(user);
	}
	

}
