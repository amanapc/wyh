package com.wyh.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyh.common.utils.EncrypUtil;
import com.wyh.common.vo.R;
import com.wyh.domain.User;
import com.wyh.mapper.UserMapper;
import com.wyh.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	

	@Override
	public boolean save(User user) {
		
		// 数据库保存加密密码
		user.setPassword(EncrypUtil.md5Pass(user.getPassword()));
		
		return userMapper.insert(user) > 0;
	}


	@Override
	public boolean userNameExists(String username) {
		
		return userMapper.selectCountByUserName(username) > 0;
	}
	

}
