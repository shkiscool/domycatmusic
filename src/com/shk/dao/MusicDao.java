package com.shk.dao;

import java.util.List;

import com.shk.entity.Music;
import com.shk.util.PageData;

public interface MusicDao {

	public List<Music> queryByKeyword(String keyword);

	/**
	 * 分页查询音乐的方法
	 * 
	 * @param page
	 *            当前页数
	 * @param pageSize
	 *            本页最大显示数
	 * @param musicLike
	 *            查询字符串
	 * @return PageData<Music>
	 */
	PageData<Music> query(int page, int pageSize, String musicLike);
}
