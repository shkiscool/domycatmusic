package com.shk.entity;

/**
 * 用户实体类
 * 
 * @author 徐扬 2018/6/2 16:30
 *
 */
public class mUser {

	private int USER_ID; // 用户编号
	private String USER_NAME; // 用户
	private String USER_PASSWORD; // 用户密码
	private int USER_LEVEL; // 用户等级（1:普通用户;2:管理员）
	private String USER_EMAIL; //用户邮箱
	private String USER_LOVE;  //用户喜好
	private String USER_PHOTO; // 用户照片

	// 无参构造
	public mUser() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "mUser [USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME + ", USER_PASSWORD=" + USER_PASSWORD
				+ ", USER_LEVEL=" + USER_LEVEL + ", USER_EMAIL=" + USER_EMAIL + ", USER_LOVE=" + USER_LOVE
				+ ", USER_PHOTO=" + USER_PHOTO + "]";
	}

	/**
	 * 不带用户编号的有参构造
	 * 
	 * @param uSER_NAME
	 *             用户名
	 * @param uSER_PASSWORD
	 *             用户密码
	 * @param uSER_LEVEL
	 *             用户等级（1:普通用户;2:管理员）
	 * @param uSER_EMAIL
	 *             用户邮箱
	 * @param uSER_LOVE
	 *             用户喜好
	 * @param uSER_PHOTO
	 *             用户照片
	 */
	public mUser(String uSER_NAME, String uSER_PASSWORD, int uSER_LEVEL, String uSER_EMAIL, String uSER_LOVE, String uSER_PHOTO) {
		super();
		USER_NAME = uSER_NAME;
		USER_PASSWORD = uSER_PASSWORD;
		USER_LEVEL = uSER_LEVEL;
		USER_EMAIL = uSER_EMAIL;
		USER_LOVE = uSER_LOVE;
		USER_PHOTO = uSER_PHOTO;
	}


	/**
	 * 有参构造
	 * 
	 * @param uSER_ID
	 *             用户编号
	 * @param uSER_NAME
	 *             用户
	 * @param uSER_PASSWORD
	 *             用户密码
	 * @param uSER_LEVE
	 *             用户等级（1:普通用户;2:管理员）
	 * @param uSER_EMAIL
	 *             用户邮箱
	 * @param uSER_LOVE
	 *             用户喜好
	 * @param uSER_PHOTO
	 *             用户照片
	 */
	public mUser(int uSER_ID, String uSER_NAME, String uSER_PASSWORD, int uSER_LEVEL,String uSER_EMAIL, String uSER_LOVE, String uSER_PHOTO) {
		super();
		USER_ID = uSER_ID;
		USER_NAME = uSER_NAME;
		USER_PASSWORD = uSER_PASSWORD;
		USER_LEVEL = uSER_LEVEL;
		USER_EMAIL = uSER_EMAIL;
		USER_LOVE = uSER_LOVE;
		USER_PHOTO = uSER_PHOTO;
	}

	public int getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}

	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}

	public int getUSER_LEVEL() {
		return USER_LEVEL;
	}

	public void setUSER_LEVEL(int uSER_LEVEL) {
		USER_LEVEL = uSER_LEVEL;
	}

	public String getUSER_PHOTO() {
		return USER_PHOTO;
	}

	public void setUSER_PHOTO(String uSER_PHOTO) {
		USER_PHOTO = uSER_PHOTO;
	}

	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}

	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}


	public String getUSER_LOVE() {
		return USER_LOVE;
	}


	public void setUSER_LOVE(String uSER_LOVE) {
		USER_LOVE = uSER_LOVE;
	}

}
