package com.bjwmt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjwmt.dao.UserDao;
import com.bjwmt.model.User;
import com.bjwmt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User findUserByID(long userID) {
		return userDao.selectByPrimaryKey(userID);
	}

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

}
