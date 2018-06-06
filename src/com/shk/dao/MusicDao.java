package com.shk.dao;

import java.util.List;

import com.shk.entity.Music;
import com.shk.util.PageData;

public interface MusicDao {

	public List<Music> queryByKeyword(String keyword);

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
	PageData<Music> query(int page, int pageSize, String musicLike);
}
