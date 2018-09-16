package com.wyh.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyh.common.utils.EncrypUtil;
import com.wyh.common.vo.R;
import com.wyh.domain.User;
import com.wyh.mapper.UserMapper;
import com.wyh.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public R login(String username, String password) {
		
		User user = userMapper.selectByUserName(username);
		if (user != null) {
			if (Objects.equals(EncrypUtil.md5Pass(password), user.getPassword())) {
				return R.createR(1000, "login ok", user);
			}
			return R.createR(1001, "fail: not match");
		}
		return R.createR(1002, "fail: no user");
	}


	@Override
	public R loginCheck(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R loginOut(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
