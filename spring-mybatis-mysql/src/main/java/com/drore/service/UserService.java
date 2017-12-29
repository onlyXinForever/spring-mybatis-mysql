package com.drore.service;

import com.drore.entity.User;

import java.util.List;

public interface UserService {
	int insertUser(User user);
	List<User> queryUser();
}
