package com.shk.service;

import java.util.List;
import com.shk.entity.Music;

/**
 * 访问歌曲数据库的service层接口
 * @author gousq 2018年6月5日 
 * 暂时提供了关键词搜索的方法，后续请按需求补充添加
 */
public interface MusicService {
	
	
	
	public List<Music> searchByKeyword(String keyword);
}
