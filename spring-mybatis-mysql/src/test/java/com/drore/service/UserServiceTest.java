package com.drore.service;

import com.drore.BaseTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserServiceTest extends BaseTest {
	@Autowired
	private UserService userService;

	@Test
	public void testGetUser(){
		assertEquals(10, userService.queryUser().size());

	}
}
