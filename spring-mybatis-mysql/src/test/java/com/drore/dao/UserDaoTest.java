package com.drore.dao;


import com.drore.BaseTest;
import com.drore.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTest extends BaseTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void testQueryUser(){
		List<User> userList = userDao.queryUser();
		System.out.println(userList);
	}

	@Test
	@Ignore
	public void testInsertUser(){
		User user = new User();
		for(int i=0;i<5;i++){
			user.setUsername("user" + i);
			user.setPassword("123" + i);
			userDao.insertUser(user);
		}
	}
}
