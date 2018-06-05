package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.usersDao;
import com.shk.entity.mUser;
import com.shk.util.DBUtil;
import com.shk.util.PageData;

/**
 * 用户DAO的实现类
 * 
 * @author 徐扬    2018/6/2 20:00
 *
 */
public class usersDaoImpl implements usersDao {

	
	/**
	 * 用户增加方法的实现
	 */
	@Override
	public boolean addUsers(mUser users) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into M_USER values(?,?,?,?,?,?,?)", users.getUSER_ID(), users.getUSER_NAME(),
				users.getUSER_PASSWORD(), users.getUSER_LEVEL(), users.getUSER_LOVE(), users.getUSER_PHOTO(),
				users.getUSER_EMAIL()) > 0;
	}

	/**
	 * 用户删除方法的实现
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from M_USER where USER_ID=?", usersId) > 0;
	}

	/**
	 * 用户修改方法的实现
	 */
	@Override
	public boolean updateUsers(mUser users) {
		// TODO Auto-generated method stub
		return DBUtil.execute(
				"update M_USER set USER_NAME=?,USER_PASSWORD=?,USER_LEVEL=?,USER_PHOTO=?,USER_EMAIL=?,USER_LOVE=? where USER_ID=?",
				users.getUSER_NAME(), users.getUSER_PASSWORD(), users.getUSER_LEVEL(),
				users.getUSER_PHOTO(), users.getUSER_EMAIL(), users.getUSER_LOVE(), users.getUSER_ID()) > 0;
	}

	/**
	 * 用户分页查询的实现
	 */
	@Override
	public PageData<mUser> queryUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		PageData<mUser> user = DBUtil.getPage("select*from M_USER where USER_NAME like ? ORDER BY USER_ID", page,
				pagesize, mUser.class, "%" + usersNameLike + "%");
		if (null != user) {
			return user;
		}
		return null;
	}

	/**
	 * 检测用户登录是否成功的实现
	 */
	@Override
	public mUser queryUsersByNameAndPwd(String userName, String userPwd) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<mUser> list = (List<mUser>) DBUtil.select("select * from M_USER where USER_NAME=? and USER_PASSWORD=?",
				mUser.class, userName, userPwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	/**
	 * 通过用户名寻找用户的实现
	 */
	@Override
	public mUser queryUsersByName(String userName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<mUser> list = (List<mUser>) DBUtil.select("select * from M_USER where USER_NAME=?", mUser.class, userName);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}
