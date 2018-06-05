package com.shk.service;

import com.shk.entity.mUser;
import com.shk.util.PageData;

/**
 * 用户的业务层
 * 
 * @author 徐扬    2018/6/2 20:00
 *
 */
public interface usersService {

	/**
	 * 实现增加用户业务的抽象方法
	 * 
	 * @param users
	 *            传入一个用户对象
	 * @return
	 */
	public boolean addUsers(mUser users);

	/**
	 * 实现删除用户业务的抽象方法
	 * 
	 * @param usersId
	 *            传入一个用户编号
	 * @return
	 */
	public boolean delUsers(int usersId);

	/**
	 * 实现修改用户业务的抽象方法
	 * 
	 * @param users
	 *            传入一个用户对象
	 * @return
	 */
	public boolean updateUsers(mUser users);

	/**
	 * 实现用户分页查询的抽象方法
	 * 
	 * @param page
	 *            传入一个页码
	 * @param pagesize
	 *            传入每页含有的数据量
	 * @param usersNameLike
	 *            传入要查找的用户名关键字
	 * @return
	 */
	public PageData<mUser> getUsers(int page, int pagesize, String usersNameLike);

	/**
	 * 实现用户登录功能的抽象方法
	 * 
	 * @param userName
	 *            传入用户名
	 * @param userPwd
	 *            传入用户密码
	 * @return
	 */
	public mUser login(String userName, String userPwd);

	/**
	 * 实现通过名字查找用户的抽象方法
	 * 
	 * @param userName
	 *            传入用户名
	 * @return
	 */
	public mUser getUserByName(String userName);
}
