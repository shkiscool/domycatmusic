package com.shk.entity;

/**
 * �û�ʵ����
 * 
 * @author ���� 2018/6/2 16:30
 *
 */
public class Users {

	private int USERID; // �û����
	private String USERNAME; // �û�
	private String USERPASSWORD; // �û�����
	private int USERLEVEL; // �û��ȼ���1:��ͨ�û�;2:����Ա��
	private String USEREMAIL; // �û�����
	private String USERLOVE; // �û�����ƫ��
	private String USERPHOTO; // �û�ͷ��
	private String USERSEX; // �û��Ա�
	private String USERBIRTHDAY; // �û�����

	// �޲ι���
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
	 * �вι���
	 * @param uSERID
	 *            �û����
	 * @param uSERNAME
	 *            �û���
	 * @param uSERPASSWORD
	 *            �û�����
	 * @param uSERLEVEL
	 *            �û��ȼ�
	 * @param uSEREMAIL
	 *            �û�����
	 * @param uSERLOVE
	 *            �û�����ƫ��
	 * @param uSERPHOTO
	 *            �û�ͷ��
	 * @param uSERSEX
	 *            �û��Ա�
	 * @param uSERBIRTHDAY
	 *            �û�����
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
