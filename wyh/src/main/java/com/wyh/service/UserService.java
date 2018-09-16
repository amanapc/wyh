package com.wyh.service;

import com.wyh.domain.User;

public interface UserService {

	boolean save(User user);
	
	boolean userNameExists(String username);
	
}
