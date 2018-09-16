package com.wyh.service;

import com.wyh.common.vo.R;

public interface LoginService {
	
	public R login(String username, String password);
	
	public R loginCheck(String token);
	
	public R loginOut(String token);

}
