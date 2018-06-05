package com.shk.entity;

/**
 * 用户与歌曲关联实体类
 * 
 * @author 徐扬 2018/6/2 17:00
 *
 */
public class userAndMusic {

	private int UANDMID;  //用户与歌曲关联编号
	private int USER_ID;  //用户编号
	private int M_ID;  //歌曲编号
	
	public userAndMusic() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "userAndMusic [UANDMID=" + UANDMID + ", USER_ID=" + USER_ID + ", M_ID=" + M_ID + "]";
	}

	/**
	 * 有参构造
	 * @param uANDMID  用户与歌曲关联编号
	 * @param uSER_ID  用户编号
	 * @param m_ID  歌曲编号
	 */
	public userAndMusic(int uANDMID, int uSER_ID, int m_ID) {
		super();
		UANDMID = uANDMID;
		USER_ID = uSER_ID;
		M_ID = m_ID;
	}

	public int getUANDMID() {
		return UANDMID;
	}

	public void setUANDMID(int uANDMID) {
		UANDMID = uANDMID;
	}

	public int getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}

	public int getM_ID() {
		return M_ID;
	}

	public void setM_ID(int m_ID) {
		M_ID = m_ID;
	}
	
	
}
