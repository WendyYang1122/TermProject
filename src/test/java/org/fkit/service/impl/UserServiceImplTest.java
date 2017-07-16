package org.fkit.service.impl;

import static org.junit.Assert.*;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends BaseTest {
	@Autowired
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		User user = userService.login("123@163.com", "123");
		System.out.println(user);
		if(user!=null){
			System.out.println("登陆成功");
		}else{
			System.out.println("错啦");
		}

	}
	
	
	
	

}
