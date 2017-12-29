package com.drore.dao;

import com.drore.entity.User;

import java.util.List;

public interface UserDao {
	int insertUser(User user);
	List<User> queryUser();
}
