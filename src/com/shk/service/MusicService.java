package com.shk.service;

import java.util.List;
import com.shk.entity.Music;

/**
 * ���ʸ������ݿ��service��ӿ�
 * @author gousq 2018��6��5�� 
 * ��ʱ�ṩ�˹ؼ��������ķ����������밴���󲹳����
 */
public interface MusicService {
	
	
	
	public List<Music> searchByKeyword(String keyword);
}
