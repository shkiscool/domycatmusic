package com.shk.entity;

/**
 * �û�ʵ����
 * 
 * @author ���� 2018/6/2 16:30
 *
 */
public class mUser {

	private int USER_ID; // �û����
	private String USER_NAME; // �û�
	private String USER_PASSWORD; // �û�����
	private int USER_LEVEL; // �û��ȼ���1:��ͨ�û�;2:����Ա��
	private String USER_EMAIL; //�û�����
	private String USER_LOVE;  //�û�ϲ��
	private String USER_PHOTO; // �û���Ƭ

	// �޲ι���
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
	 * �����û���ŵ��вι���
	 * 
	 * @param uSER_NAME
	 *             �û���
	 * @param uSER_PASSWORD
	 *             �û�����
	 * @param uSER_LEVEL
	 *             �û��ȼ���1:��ͨ�û�;2:����Ա��
	 * @param uSER_EMAIL
	 *             �û�����
	 * @param uSER_LOVE
	 *             �û�ϲ��
	 * @param uSER_PHOTO
	 *             �û���Ƭ
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
	 * �вι���
	 * 
	 * @param uSER_ID
	 *             �û����
	 * @param uSER_NAME
	 *             �û�
	 * @param uSER_PASSWORD
	 *             �û�����
	 * @param uSER_LEVE
	 *             �û��ȼ���1:��ͨ�û�;2:����Ա��
	 * @param uSER_EMAIL
	 *             �û�����
	 * @param uSER_LOVE
	 *             �û�ϲ��
	 * @param uSER_PHOTO
	 *             �û���Ƭ
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
