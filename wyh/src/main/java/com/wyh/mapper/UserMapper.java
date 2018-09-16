package com.wyh.mapper;

import com.wyh.domain.User;

public interface UserMapper {
	
	/**
	 * 按用户名查询，供登录接口
	 * @param id
	 * @return
	 */
	User selectByUserName(String username);
	
	/**
	 * 注册时，确认用户名是否可用
	 * @param username
	 * @return
	 */
	int selectCountByUserName(String username);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}