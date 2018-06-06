package com.shk.service;

import java.util.List;

import com.shk.entity.Music;
import com.shk.entity.Song;
import com.shk.util.PageData;

/**
 * 访问歌曲数据库的service层接口
 * @author gousq 2018年6月5日 
 * 暂时提供了关键词搜索的方法，后续请按需求补充添加
 */
public interface MusicService {
	
	public List<Music> searchByKeyword(String keyword);
	
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
	PageData<Music> getMusic(int page,int pageSize, String musicLike);
	
	
	/**
	 * 将Music转换成Song格式
	 * @param list Music的集合
	 * @return	Song的字符串
	 */
	public String changeToSongStr(List<Music> list);
}
