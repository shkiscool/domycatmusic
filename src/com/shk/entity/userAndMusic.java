package com.shk.entity;

/**
 * �û����������ʵ����
 * 
 * @author ���� 2018/6/2 17:00
 *
 */
public class userAndMusic {

	private int UANDMID;  //�û�������������
	private int USER_ID;  //�û����
	private int M_ID;  //�������
	
	public userAndMusic() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "userAndMusic [UANDMID=" + UANDMID + ", USER_ID=" + USER_ID + ", M_ID=" + M_ID + "]";
	}

	/**
	 * �вι���
	 * @param uANDMID  �û�������������
	 * @param uSER_ID  �û����
	 * @param m_ID  �������
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
