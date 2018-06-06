package com.shk.test;

import com.shk.entity.Users;
import com.shk.service.usersService;
import com.shk.serviceImpl.usersServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wqeqe");
		usersService us = new usersServiceImpl();
		for (int i = 2; i < 50; i++) {
			Users u = new Users(i, "实验体"+i+"号", "123456", 1, "shiyanti"+i+"@sina.com", "无", "无");
			boolean flag = us.addUsers(u);
			System.out.println(flag);
		}
		
		
	}

}
