package com.shk.entity;

/**
 * “Ù¿÷ µÃÂ¿‡
 * 
 * @author –Ï—Ô 2018/6/2 16:30
 *
 */
public class Music {

	private int M_ID; // “Ù¿÷±‡∫≈
	private int T_ID; // “Ù¿÷¿‡–Õ±‡∫≈
	private int SCENEID; // “Ù¿÷≥°æ∞±‡∫≈
	private int MODEID; // «˙∑Á£®∆´œÚƒ≥÷÷–ƒ«È£©±‡∫≈
	private int GENRE_ID; // ¡˜≈…±‡∫≈
	private int LANGUAGID; // “Ù¿÷”Ô÷÷±‡∫≈
	private int SINGERID; // ∏Ë ÷±‡∫≈
	private String M_NAME; // “Ù¿÷√˚≥∆
	private String M_URL; // “Ù¿÷¡¥Ω”¬∑æ∂
	private int M_COUNT; // “Ù¿÷µ„ª˜¥Œ ˝
	private String M_LYRIC; // ∏Ë¥ 

	public Music() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "music [M_ID=" + M_ID + ", T_ID=" + T_ID + ", SCENEID=" + SCENEID + ", MODEID=" + MODEID + ", GENRE_ID="
				+ GENRE_ID + ", LANGUAGID=" + LANGUAGID + ", SINGERID=" + SINGERID + ", M_NAME=" + M_NAME + ", M_URL="
				+ M_URL + ", M_COUNT=" + M_COUNT + ", M_LYRIC=" + M_LYRIC + "]";
	}

	/**
	 * ”–≤Œππ‘Ï
	 * 
	 * @param m_ID
	 *            “Ù¿÷±‡∫≈
	 * @param t_ID
	 *            “Ù¿÷¿‡–Õ±‡∫≈
	 * @param sCENEID
	 *            “Ù¿÷≥°æ∞±‡∫≈
	 * @param mODEID
	 *            «˙∑Á£®∆´œÚƒ≥÷÷–ƒ«È£©±‡∫≈
	 * @param gENRE_ID
	 *            ¡˜≈…±‡∫≈
	 * @param lANGUAGID
	 *            “Ù¿÷”Ô÷÷±‡∫≈
	 * @param sINGERID
	 *            ∏Ë ÷±‡∫≈
	 * @param m_NAME
	 *            “Ù¿÷√˚≥∆
	 * @param m_URL
	 *            “Ù¿÷¡¥Ω”¬∑æ∂
	 * @param m_COUNT
	 *            “Ù¿÷µ„ª˜¥Œ ˝
	 * @param m_LYRIC
	 *            ∏Ë¥ 
	 */
	public Music(int m_ID, int t_ID, int sCENEID, int mODEID, int gENRE_ID, int lANGUAGID, int sINGERID, String m_NAME,
			String m_URL, int m_COUNT, String m_LYRIC) {
		super();
		M_ID = m_ID;
		T_ID = t_ID;
		SCENEID = sCENEID;
		MODEID = mODEID;
		GENRE_ID = gENRE_ID;
		LANGUAGID = lANGUAGID;
		SINGERID = sINGERID;
		M_NAME = m_NAME;
		M_URL = m_URL;
		M_COUNT = m_COUNT;
		M_LYRIC = m_LYRIC;
	}

	public int getM_ID() {
		return M_ID;
	}

	public void setM_ID(int m_ID) {
		M_ID = m_ID;
	}

	public int getT_ID() {
		return T_ID;
	}

	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}

	public int getSCENEID() {
		return SCENEID;
	}

	public void setSCENEID(int sCENEID) {
		SCENEID = sCENEID;
	}

	public int getMODEID() {
		return MODEID;
	}

	public void setMODEID(int mODEID) {
		MODEID = mODEID;
	}

	public int getGENRE_ID() {
		return GENRE_ID;
	}

	public void setGENRE_ID(int gENRE_ID) {
		GENRE_ID = gENRE_ID;
	}

	public int getLANGUAGID() {
		return LANGUAGID;
	}

	public void setLANGUAGID(int lANGUAGID) {
		LANGUAGID = lANGUAGID;
	}

	public int getSINGERID() {
		return SINGERID;
	}

	public void setSINGERID(int sINGERID) {
		SINGERID = sINGERID;
	}

	public String getM_NAME() {
		return M_NAME;
	}

	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}

	public String getM_URL() {
		return M_URL;
	}

	public void setM_URL(String m_URL) {
		M_URL = m_URL;
	}

	public int getM_COUNT() {
		return M_COUNT;
	}

	public void setM_COUNT(int m_COUNT) {
		M_COUNT = m_COUNT;
	}

	public String getM_LYRIC() {
		return M_LYRIC;
	}

	public void setM_LYRIC(String m_LYRIC) {
		M_LYRIC = m_LYRIC;
	}

}
