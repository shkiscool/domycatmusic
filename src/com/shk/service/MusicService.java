package com.shk.service;

import java.util.List;

import com.shk.entity.Music;
import com.shk.entity.Song;
import com.shk.util.PageData;

/**
 * ���ʸ������ݿ��service��ӿ�
 * @author gousq 2018��6��5�� 
 * ��ʱ�ṩ�˹ؼ��������ķ����������밴���󲹳����
 */
public interface MusicService {
	
	public List<Music> searchByKeyword(String keyword);
	
	/**
	 * ��ҳ��ѯ���ֵķ���
	 * 
	 * @param page
	 *            ��ǰҳ��
	 * @param pageSize
	 *            ��ҳ�����ʾ��
	 * @param musicLike
	 *            ��ѯ�ַ���
	 * @return PageData<Music>
	 */
	PageData<Music> getMusic(int page,int pageSize, String musicLike);
	
	
	/**
	 * ��Musicת����Song��ʽ
	 * @param list Music�ļ���
	 * @return	Song���ַ���
	 */
	public String changeToSongStr(List<Music> list);
}
