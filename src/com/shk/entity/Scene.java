package com.shk.entity;

/**
 * ���ֳ���ʵ����
 * 
 * @author ���� 2018/6/2 17:00
 *
 */
public class Scene {

	private int SCENEID; // ���ֳ������
	private String SCENENAME; // ���ֳ�������

	public Scene() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Scene [SCENEID=" + SCENEID + ", SCENENAME=" + SCENENAME + "]";
	}

	/**
	 * �вι���
	 * 
	 * @param sCENEID
	 *            ���ֳ������
	 * @param sCENENAME
	 *            ���ֳ�������
	 */
	public Scene(int sCENEID, String sCENENAME) {
		super();
		SCENEID = sCENEID;
		SCENENAME = sCENENAME;
	}

	public int getSCENEID() {
		return SCENEID;
	}

	public void setSCENEID(int sCENEID) {
		SCENEID = sCENEID;
	}

	public String getSCENENAME() {
		return SCENENAME;
	}

	public void setSCENENAME(String sCENENAME) {
		SCENENAME = sCENENAME;
	}

}
