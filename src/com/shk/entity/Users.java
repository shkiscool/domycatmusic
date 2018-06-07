package com.shk.entity;

/**
 * 用户实体类
 * 
 * @author 徐扬 2018/6/2 16:30
 *
 */
public class Users {

	private int USERID; // 用户编号
	private String USERNAME; // 用户
	private String USERPASSWORD; // 用户密码
	private int USERLEVEL; // 用户等级（1:普通用户;2:管理员）
	private String USEREMAIL; // 用户邮箱
	private String USERLOVE; // 用户音乐偏好
	private String USERPHOTO; // 用户头像
	private String USERSEX; // 用户性别
	private String USERBIRTHDAY; // 用户生日

	// 无参构造
	public Users() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [USERID=" + USERID + ", USERNAME=" + USERNAME + ", USERPASSWORD=" + USERPASSWORD + ", USERLEVEL="
				+ USERLEVEL + ", USEREMAIL=" + USEREMAIL + ", USERLOVE=" + USERLOVE + ", USERPHOTO=" + USERPHOTO
				+ ", USERSEX=" + USERSEX + ", USERBIRTHDAY=" + USERBIRTHDAY + "]";
	}

	/**
	 * 有参构造
	 * @param uSERID
	 *            用户编号
	 * @param uSERNAME
	 *            用户名
	 * @param uSERPASSWORD
	 *            用户密码
	 * @param uSERLEVEL
	 *            用户等级
	 * @param uSEREMAIL
	 *            用户邮箱
	 * @param uSERLOVE
	 *            用户音乐偏好
	 * @param uSERPHOTO
	 *            用户头像
	 * @param uSERSEX
	 *            用户性别
	 * @param uSERBIRTHDAY
	 *            用户生日
	 */
	public Users(int uSERID, String uSERNAME, String uSERPASSWORD, int uSERLEVEL, String uSEREMAIL, String uSERLOVE,
			String uSERPHOTO, String uSERSEX, String uSERBIRTHDAY) {
		super();
		USERID = uSERID;
		USERNAME = uSERNAME;
		USERPASSWORD = uSERPASSWORD;
		USERLEVEL = uSERLEVEL;
		USEREMAIL = uSEREMAIL;
		USERLOVE = uSERLOVE;
		USERPHOTO = uSERPHOTO;
		USERSEX = uSERSEX;
		USERBIRTHDAY = uSERBIRTHDAY;
	}

	public int getUSERID() {
		return USERID;
	}

	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getUSERPASSWORD() {
		return USERPASSWORD;
	}

	public void setUSERPASSWORD(String uSERPASSWORD) {
		USERPASSWORD = uSERPASSWORD;
	}

	public int getUSERLEVEL() {
		return USERLEVEL;
	}

	public void setUSERLEVEL(int uSERLEVEL) {
		USERLEVEL = uSERLEVEL;
	}

	public String getUSEREMAIL() {
		return USEREMAIL;
	}

	public void setUSEREMAIL(String uSEREMAIL) {
		USEREMAIL = uSEREMAIL;
	}

	public String getUSERLOVE() {
		return USERLOVE;
	}

	public void setUSERLOVE(String uSERLOVE) {
		USERLOVE = uSERLOVE;
	}

	public String getUSERPHOTO() {
		return USERPHOTO;
	}

	public void setUSERPHOTO(String uSERPHOTO) {
		USERPHOTO = uSERPHOTO;
	}

	public String getUSERSEX() {
		return USERSEX;
	}

	public void setUSERSEX(String uSERSEX) {
		USERSEX = uSERSEX;
	}

	public String getUSERBIRTHDAY() {
		return USERBIRTHDAY;
	}

	public void setUSERBIRTHDAY(String uSERBIRTHDAY) {
		USERBIRTHDAY = uSERBIRTHDAY;
	}

}
