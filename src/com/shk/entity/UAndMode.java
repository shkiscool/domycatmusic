package com.shk.entity;

/**
 * �û�������ʵ����
 * 
 * @author ���� 2018/6/2 17:00
 *
 */
public class UAndMode {

	private int UANDMID; // �û��������������
	private int USER_ID; // �û����
	private int MODEID; // ���磨���飩���
	private int UAMCOUNT; // �û��������͵Ĵ���

	public UAndMode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "uAndMode [UANDMID=" + UANDMID + ", USER_ID=" + USER_ID + ", MODEID=" + MODEID + ", UAMCOUNT=" + UAMCOUNT
				+ "]";
	}

	/**
	 * �вι���
	 * 
	 * @param uANDMID
	 *            �û��������������
	 * @param uSER_ID
	 *            �û����
	 * @param mODEID
	 *            ���磨���飩���
	 * @param uAMCOUNT
	 *            �û��������͵Ĵ���
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
