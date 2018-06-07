package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.UsersDao;
import com.shk.entity.Users;
import com.shk.util.DBUtil;
import com.shk.util.PageData;

/**
 * 用户DAO的实现类
 * 
 * @author 徐扬 2018/6/2 20:00
 *
 */
public class UsersDaoImpl implements UsersDao {

	/**
	 * 用户增加方法的实现
	 */
	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into MUSER values(?,?,?,?,?,?,?,?,to_date(?,'YYYY-MM-DD'))", users.getUSERID(),
				users.getUSERNAME(), users.getUSERPASSWORD(), users.getUSERLEVEL(), users.getUSERLOVE(),
				users.getUSERPHOTO(), users.getUSEREMAIL(), users.getUSERSEX(), users.getUSERBIRTHDAY()) > 0;
	}

	/**
	 * 用户删除方法的实现
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from MUSER where USERID=?", usersId) > 0;
	}

	/**
	 * 用户修改方法的实现
	 */
	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return DBUtil.execute(
				"update MUSER set USERNAME=?,USERPASSWORD=?,USERLEVEL=?,USERPHOTO=?,USEREMAIL=?,USERLOVE=?,USERSEX=?,USERBIRTHDAY=to_date(?,'YYYY-MM-DD') where USERID=?",
				users.getUSERNAME(), users.getUSERPASSWORD(), users.getUSERLEVEL(), users.getUSERPHOTO(),
				users.getUSEREMAIL(), users.getUSERLOVE(), users.getUSERSEX(), users.getUSERBIRTHDAY(),
				users.getUSERID()) > 0;
	}

	/**
	 * 用户分页查询的实现
	 */
	@Override
	public PageData<Users> queryUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		PageData<Users> user = DBUtil.getPage("select*from MUSER where USERNAME like ? ORDER BY USERID", page, pagesize,
				Users.class, "%" + usersNameLike + "%");
		if (null != user) {
			return user;
		}
		return null;
	}

	/**
	 * 检测用户登录是否成功的实现
	 */
	@Override
	public Users queryUsersByNameAndPwd(String userName, String userPwd) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) DBUtil.select("select * from MUSER where USERNAME=? and USERPASSWORD=?",
				Users.class, userName, userPwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	/**
	 * 通过用户名寻找用户的实现
	 */
	@Override
	public Users queryUsersByName(String userName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) DBUtil.select("select * from MUSER where USERNAME=?", Users.class, userName);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}
