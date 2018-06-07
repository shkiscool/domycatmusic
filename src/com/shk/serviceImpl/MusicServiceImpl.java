package com.shk.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.shk.dao.MusicDao;
import com.shk.daoImpl.MusicDaoImpl;
import com.shk.entity.Music;
import com.shk.entity.Song;
import com.shk.service.MusicService;
import com.shk.util.PageData;

public class MusicServiceImpl implements MusicService {

	MusicDao md = new MusicDaoImpl();

	@Override
	public List<Music> searchByKeyword(String keyword) {
		return md.queryByKeyword(keyword);
	}

	@Override
	public PageData<Music> getMusic(int page, int pageSize, String musicLike) {
		return md.query(page, pageSize, musicLike);
	}

	/**
	 * 将Music转换成Song格式
	 * 
	 * @param list
	 *            Music的集合
	 * @return Song的字符串
	 */
	@Override
	public String changeToSongStr(List<Music> list) {
		List<Song> songList = new ArrayList<Song>();

		for (Music music : list) {
			Song song = new Song(music.getmName(), music.getmUrl(), music.getmImg(), music.getSingerName());
			songList.add(song);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < songList.size(); i++) {
			sb.append("{");
			sb.append(songList.get(i).toString());
			if(i==(songList.size()-1)) {
				sb.append("}");
			} else {
				
				sb.append("},");
			}
		}
		sb.append("]");
		String str = new String(sb);

		return str;
	}
	@Override
	public boolean addMusic(Music music) {
		// TODO Auto-generated method stub
		return md.addMusic(music);
	}

	@Override
	public boolean delMusic(int musicId) {
		// TODO Auto-generated method stub
		return md.delMusic(musicId);
	}

	@Override
	public List<Music> getAllMusic() {
		// TODO Auto-generated method stub
		return md.queryAllMusic();
	}

	//勾思奇：修改逻辑处理
	@Override
	public Music getMusicById(int musicId) {
		// TODO Auto-generated method stub
		List<Music> list =  md.queryMusicById(musicId);
		if(list.size()>0) {
			return list.get(0);
		}else return null;
	}

	@Override
	public List<Music> getMusicByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return md.queryMusicByTypeId(typeId);
	}

	@Override
	public List<Music> getMusicBySingerId(int singerId) {
		// TODO Auto-generated method stub
		return md.queryMusicBySingerId(singerId);
	}

	@Override
	public List<Music> getMusicBySingerName(String singerName) {
		// TODO Auto-generated method stub
		return md.queryMusicBySingerName(singerName);
	}

	@Override
	public List<Music> getMusicByMNameOrSingerName(String name) {
		// TODO Auto-generated method stub
		return md.queryMusicByMNameOrSingerName(name);
	}

	@Override
	public List<Music> getMusicByAnyWord(String str) {
		// TODO Auto-generated method stub
		return md.queryMusicByAnyWord(str);
	}

	
}
