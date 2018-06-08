package com.shk.entity;

/**
 * 定义一个只有歌手id和歌手名字的类 匹配视图view_singer;
 * @author gousq
 *
 */
public class View_Singer {
	
	private int singerId;
	private String singerName;
	
	@Override
	public String toString() {
		return "SingersId [singerId=" + singerId + ", singerName=" + singerName + "]";
	}

	public int getSingerId() {
		return singerId;
	}
	
	public View_Singer() {
		// TODO Auto-generated constructor stub
	}

	public View_Singer(int singerId, String singerName) {
		super();
		this.singerId = singerId;
		this.singerName = singerName;
	}

	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
}
