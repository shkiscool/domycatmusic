package com.shk.serviceImpl;

import com.shk.dao.usersDao;
import com.shk.daoImpl.usersDaoImpl;
import com.shk.entity.mUser;
import com.shk.service.usersService;
import com.shk.util.PageData;

/**
 * 用户业务层的实现
 * 
 * @author 徐扬 2018/6/2 20:00
 *
 */
public class usersServiceImpl implements usersService {

	usersDao ud = new usersDaoImpl();

	/**
	 * 用户增加业务的实现
	 */
	@Override
	public boolean addUsers(mUser users) {
		// TODO Auto-generated method stub
		return ud.addUsers(users);
	}

	/**
	 * 用户删除业务的实现
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return ud.delUsers(usersId);
	}

	/**
	 * 用户修改业务的实现
	 */
	@Override
	public boolean updateUsers(mUser users) {
		// TODO Auto-generated method stub
		return ud.updateUsers(users);
	}

	/**
	 * 用户分页查询的实现
	 */
	@Override
	public PageData<mUser> getUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		return ud.queryUsers(page, pagesize, usersNameLike);
	}

	/**
	 * 用户登录操作的实现
	 */
	@Override
	public mUser login(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return ud.queryUsersByNameAndPwd(userName, userPwd);
	}

	/**
	 * 通过用户名查询用户的实现
	 */
	@Override
	public mUser getUserByName(String userName) {
		// TODO Auto-generated method stub
		return ud.queryUsersByName(userName);
	}

}
