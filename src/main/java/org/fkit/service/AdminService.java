package org.fkit.service;

import org.fkit.domain.Admin;

public interface AdminService {

	Admin login(String name,String password);
}
