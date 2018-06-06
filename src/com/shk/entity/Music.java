package com.shk.entity;

import java.sql.Clob;

public class Music {
	/**
	 * 2018年6月5日 勾思奇根据数据库修改  歌曲的实体类 匹配MUISIC表格的相关查询
	 */
	
	//属性，与列名对应（此处用标准的驼峰格式）；
	private int mId;
	private int tId;
	private int singerId;
	private String mName;
	private String mUrl;
	private int mCount;
	private Clob mLyric;
	private String mDate;
	private String mImg;
	private String singerName;
	private String mTime;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Music [mId=" + mId + ", tId=" + tId + ", singerId=" + singerId + ", mName=" + mName + ", mUrl=" + mUrl
				+ ", mCount=" + mCount + ", mLyric=" + mLyric + ", mDate=" + mDate + ", mImg=" + mImg + ", singerName="
				+ singerName + ", mTime=" + mTime + "]";
	}

	public Music(int mId, int tId, int singerId, String mName, String mUrl, int mCount, Clob mLyric, String mDate,
			String mImg, String singerName, String mTime) {
		super();
		this.mId = mId;
		this.tId = tId;
		this.singerId = singerId;
		this.mName = mName;
		this.mUrl = mUrl;
		this.mCount = mCount;
		this.mLyric = mLyric;
		this.mDate = mDate;
		this.mImg = mImg;
		this.singerName = singerName;
		this.mTime = mTime;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public int getSingerId() {
		return singerId;
	}
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmUrl() {
		return mUrl;
	}
	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}
	public int getmCount() {
		return mCount;
	}
	public void setmCount(int mCount) {
		this.mCount = mCount;
	}
	public Clob getmLyric() {
		return mLyric;
	}
	public void setmLyric(Clob mLyric) {
		this.mLyric = mLyric;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public String getmImg() {
		return mImg;
	}
	public void setmImg(String mImg) {
		this.mImg = mImg;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getmTime() {
		return mTime;
	}
	public void setmTime(String mTime) {
		this.mTime = mTime;
	}
	
	
}
