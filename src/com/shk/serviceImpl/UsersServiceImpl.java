package com.shk.serviceImpl;

import com.shk.dao.UsersDao;
import com.shk.daoImpl.UsersDaoImpl;
import com.shk.entity.Users;
import com.shk.service.UsersService;
import com.shk.util.PageData;

/**
 * �û�ҵ����ʵ��
 * 
 * @author ���� 2018/6/2 20:00
 *
 */
public class UsersServiceImpl implements UsersService {

	UsersDao ud = new UsersDaoImpl();

	/**
	 * �û�����ҵ���ʵ��
	 */
	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return ud.addUsers(users);
	}

	/**
	 * �û�ɾ��ҵ���ʵ��
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return ud.delUsers(usersId);
	}

	/**
	 * �û��޸�ҵ���ʵ��
	 */
	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return ud.updateUsers(users);
	}

	/**
	 * �û���ҳ��ѯ��ʵ��
	 */
	@Override
	public PageData<Users> getUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		return ud.queryUsers(page, pagesize, usersNameLike);
	}

	/**
	 * �û���¼������ʵ��
	 */
	@Override
	public Users login(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return ud.queryUsersByNameAndPwd(userName, userPwd);
	}

	/**
	 * ͨ���û�����ѯ�û���ʵ��
	 */
	@Override
	public Users getUserByName(String userName) {
		// TODO Auto-generated method stub
		return ud.queryUsersByName(userName);
	}

}
