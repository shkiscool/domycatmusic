package com.shk.entity;

/**
 * 音乐场景实体类
 * 
 * @author 徐扬 2018/6/2 17:00
 *
 */
public class Scene {

	private int SCENEID; // 音乐场景编号
	private String SCENENAME; // 音乐场景名字

	public Scene() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Scene [SCENEID=" + SCENEID + ", SCENENAME=" + SCENENAME + "]";
	}

	/**
	 * 有参构造
	 * 
	 * @param sCENEID
	 *            音乐场景编号
	 * @param sCENENAME
	 *            音乐场景名字
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
