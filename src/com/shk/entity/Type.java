package com.shk.entity;

/**
 * ��������ʵ����
 * 
 * @author ���� 2018/6/2 17:00
 *
 */
public class Type {

	private int T_ID;  //�������ͱ��
	private String T_NAME;  //������������

	public Type() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Type [T_ID=" + T_ID + ", T_NAME=" + T_NAME + "]";
	}

	/**
	 * �вι���
	 * @param t_ID  �������ͱ��
	 * @param t_NAME  ������������
	 */
	public Type(int t_ID, String t_NAME) {
		super();
		T_ID = t_ID;
		T_NAME = t_NAME;
	}

	public int getT_ID() {
		return T_ID;
	}

	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}

	public String getT_NAME() {
		return T_NAME;
	}

	public void setT_NAME(String t_NAME) {
		T_NAME = t_NAME;
	}

}
