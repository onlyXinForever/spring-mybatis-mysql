package com.drore.service.impl;

import com.drore.dao.UserDao;
import com.drore.entity.User;
import com.drore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> queryUser() {
		return userDao.queryUser();
	}
}
