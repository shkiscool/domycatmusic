package com.shk.test;

import com.shk.entity.Users;
import com.shk.service.UsersService;
import com.shk.serviceImpl.UsersServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersService us = new UsersServiceImpl();
//		for (int i = 2; i < 50; i++) {
//			Users u = new Users(i, "ʵ����"+i+"��", "123456", 1, "shiyanti"+i+"@sina.com", "��", "��" ,"��" , "2018/6/7");
//			boolean flag = us.addUsers(u);
//			System.out.println(flag);
//		}
		/*for (int i = 2; i < 50; i++) {
			boolean flag = us.delUsers(i);
			System.out.println(flag);
		}*/
		
		Users u1 = us.getUserByName("С��");
		System.out.println(u1);
	}

}
