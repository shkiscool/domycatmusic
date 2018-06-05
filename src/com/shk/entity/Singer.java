package com.shk.entity;

/**
 * 歌手实体类
 * 
 * @author 徐扬 2018/6/2 16:30
 *
 */
public class Singer {

	private int SINGERID; // 歌手编号
	private String SINGERNAME; // 歌手名字
	private int SINGERZONE; // 歌手地区
	private String SINGERDESCRIBE; // 歌手资料
	private String SINGERPHOTO; // 歌手头像

	public Singer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "singer [SINGERID=" + SINGERID + ", SINGERNAME=" + SINGERNAME + ", SINGERZONE=" + SINGERZONE
				+ ", SINGERDESCRIBE=" + SINGERDESCRIBE + ", SINGERPHOTO=" + SINGERPHOTO + "]";
	}

	/**
	 * 有参构造
	 * 
	 * @param sINGERID
	 *            歌手编号
	 * @param sINGERNAME
	 *            歌手名字
	 * @param sINGERZONE
	 *            歌手地区
	 * @param sINGERDESCRIBE
	 *            歌手资料
	 * @param sINGERPHOTO
	 *            歌手头像
	 */
	public Singer(int sINGERID, String sINGERNAME, int sINGERZONE, String sINGERDESCRIBE, String sINGERPHOTO) {
		super();
		SINGERID = sINGERID;
		SINGERNAME = sINGERNAME;
		SINGERZONE = sINGERZONE;
		SINGERDESCRIBE = sINGERDESCRIBE;
		SINGERPHOTO = sINGERPHOTO;
	}

	public int getSINGERID() {
		return SINGERID;
	}

	public void setSINGERID(int sINGERID) {
		SINGERID = sINGERID;
	}

	public String getSINGERNAME() {
		return SINGERNAME;
	}

	public void setSINGERNAME(String sINGERNAME) {
		SINGERNAME = sINGERNAME;
	}

	public int getSINGERZONE() {
		return SINGERZONE;
	}

	public void setSINGERZONE(int sINGERZONE) {
		SINGERZONE = sINGERZONE;
	}

	public String getSINGERDESCRIBE() {
		return SINGERDESCRIBE;
	}

	public void setSINGERDESCRIBE(String sINGERDESCRIBE) {
		SINGERDESCRIBE = sINGERDESCRIBE;
	}

	public String getSINGERPHOTO() {
		return SINGERPHOTO;
	}

	public void setSINGERPHOTO(String sINGERPHOTO) {
		SINGERPHOTO = sINGERPHOTO;
	}

}
