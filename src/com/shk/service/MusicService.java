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
	/**
	 * 添加歌曲
	 * @param music 歌曲对象
	 * @return 返回true添加成功  false添加失败
	 */
	public boolean addMusic(Music music);
	/**
	 * 删除歌曲
	 * @param musicId 歌曲ID
	 * @return 返回true删除成功 false删除失败
	 */
	public boolean delMusic(int musicId);
	/**
	 * 搜索所有的歌曲
	 * @return 歌曲列表
	 */
	public List<Music> getAllMusic();
	/**
	 * 通过歌曲ID搜索歌曲
	 * @param musicId 歌曲ID
	 * @return 返回一首歌
	 */
	public Music getMusicById(int musicId);
	/**
	 * 通过歌曲的类型ID搜索同一种类型或风格的歌曲
	 * @param typeId 类型ID
	 * @return 歌曲列表
	 */
	public List<Music> getMusicByTypeId(int typeId);
	/**
	 * 通过歌手的ID来搜索歌手的歌曲
	 * @param singerId 歌手ID
	 * @return 歌曲列表
	 */
	public List<Music> getMusicBySingerId(int singerId);
	/**
	 * 通过歌手的名字进行模糊查询歌手的歌
	 * @param singerName 歌手名字中包含的字符串
	 * @return 歌曲列表
	 */
	public List<Music> getMusicBySingerName(String singerName);
	/**
	 * 通过歌曲或者歌手名称进行模糊查询
	 * @param name 歌曲或歌手名称中包含的字符串
	 * @return 歌曲列表
	 */
	public List<Music> getMusicByMNameOrSingerName(String name);
	/**
	 * 通过歌曲名称或歌手名称或歌词模糊查询
	 * @param str 歌曲名称或歌手名称或歌词包含的字符串
	 * @return 歌曲列表
	 */
	public List<Music> getMusicByAnyWord(String str);
	
//	public List<Music> getFavoriteMusicByUserNameAndPwd(String userName,String userPwd);

}
