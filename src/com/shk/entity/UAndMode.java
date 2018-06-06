package com.shk.entity;

/**
 * 用户与心情实体类
 * 
 * @author 徐扬 2018/6/2 17:00
 *
 */
public class UAndMode {

	private int UANDMID; // 用户与心情表关联编号
	private int USER_ID; // 用户编号
	private int MODEID; // 曲风（心情）编号
	private int UAMCOUNT; // 用户听歌类型的次数

	public UAndMode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "uAndMode [UANDMID=" + UANDMID + ", USER_ID=" + USER_ID + ", MODEID=" + MODEID + ", UAMCOUNT=" + UAMCOUNT
				+ "]";
	}

	/**
	 * 有参构造
	 * 
	 * @param uANDMID
	 *            用户与心情表关联编号
	 * @param uSER_ID
	 *            用户编号
	 * @param mODEID
	 *            曲风（心情）编号
	 * @param uAMCOUNT
	 *            用户听歌类型的次数
	 */
	public UAndMode(int uANDMID, int uSER_ID, int mODEID, int uAMCOUNT) {
		super();
		UANDMID = uANDMID;
		USER_ID = uSER_ID;
		MODEID = mODEID;
		UAMCOUNT = uAMCOUNT;
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

	public int getMODEID() {
		return MODEID;
	}

	public void setMODEID(int mODEID) {
		MODEID = mODEID;
	}

	public int getUAMCOUNT() {
		return UAMCOUNT;
	}

	public void setUAMCOUNT(int uAMCOUNT) {
		UAMCOUNT = uAMCOUNT;
	}

}
