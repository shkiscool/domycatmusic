package com.shk.entity;

/**
 * ����ʵ����
 * 
 * @author ���� 2018/6/2 16:30
 *
 */
public class Singer {

	private int SINGERID; // ���ֱ��
	private String SINGERNAME; // ��������
	private int SINGERZONE; // ���ֵ���
	private String SINGERDESCRIBE; // ��������
	private String SINGERPHOTO; // ����ͷ��

	public Singer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "singer [SINGERID=" + SINGERID + ", SINGERNAME=" + SINGERNAME + ", SINGERZONE=" + SINGERZONE
				+ ", SINGERDESCRIBE=" + SINGERDESCRIBE + ", SINGERPHOTO=" + SINGERPHOTO + "]";
	}

	/**
	 * �вι���
	 * 
	 * @param sINGERID
	 *            ���ֱ��
	 * @param sINGERNAME
	 *            ��������
	 * @param sINGERZONE
	 *            ���ֵ���
	 * @param sINGERDESCRIBE
	 *            ��������
	 * @param sINGERPHOTO
	 *            ����ͷ��
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
