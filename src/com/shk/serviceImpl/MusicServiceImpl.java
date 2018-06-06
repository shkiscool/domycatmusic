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
}
