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
			Users u = new Users(i, "ʵ����"+i+"��", "123456", 1, "shiyanti"+i+"@sina.com", "��", "��");
			boolean flag = us.addUsers(u);
			System.out.println(flag);
		}
		
		
	}

}
