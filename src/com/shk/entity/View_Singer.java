package com.shk.entity;

/**
 * ����һ��ֻ�и���id�͸������ֵ��� ƥ����ͼview_singer;
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
