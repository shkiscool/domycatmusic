package com.shk.dao;

import com.shk.entity.Users;
import com.shk.util.PageData;

/**
 * 用户表的DAO
 * 
 * @author Administrator
 *
 */
public interface usersDao {

	/**
	 * 用户的增加操作抽象方法
	 * 
	 * @param users
	 *            传入一个用户对象
	 * @return
	 */
	public boolean addUsers(Users users);

	/**
	 * 用户的删除操作抽象方法
	 * 
	 * @param usersId
	 *            传入用户ID
	 * @return
	 */
	public boolean delUsers(int usersId);

	/**
	 * 用户的修改操作抽象方法
	 * 
	 * @param users
	 *            传入一个用户对象
	 * @return
	 */
	public boolean updateUsers(Users users);

	/**
	 * 用户的分页查询抽象方法
	 * 
	 * @param page
	 *            传入一个页码
	 * @param pagesize
	 *            传入每页含有的数据量
	 * @param usersNameLike
	 *            传入要查找的用户名关键字
	 * @return
	 */
	public PageData<Users> queryUsers(int page, int pagesize, String usersNameLike);

	/**
	 * 检测用户登录的抽象方法
	 * 
	 * @param userName
	 *            传入用户名
	 * @param userPwd
	 *            传入用户密码
	 * @return
	 */
	public Users queryUsersByNameAndPwd(String userName, String userPwd);

	/**
	 * 通过名字查询用户信息的抽象方法
	 * 
	 * @param userName
	 *            传入用户名
	 * @return
	 */
	public Users queryUsersByName(String userName);
}
