package org.fkit.service.impl;

import org.fkit.domain.Admin;
import org.fkit.mapper.AdminMapper;
import org.fkit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	@Transactional(readOnly=true)
	@Override
	public Admin login(String name,String password){
		return adminMapper.findWithNameAndPassword(name, password);
	}
}
