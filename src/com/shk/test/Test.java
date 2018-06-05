package com.shk.test;

import com.shk.entity.mUser;
import com.shk.service.usersService;
import com.shk.serviceImpl.usersServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usersService us = new usersServiceImpl();
		
		mUser u = us.login("Ð¡°×", "qaz123");
		
		System.out.println(u);
	}

}
