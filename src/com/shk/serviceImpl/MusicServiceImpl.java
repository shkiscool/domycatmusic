package com.shk.serviceImpl;

import java.util.List;

import com.shk.dao.MusicDao;
import com.shk.daoImpl.MusicDaoImpl;
import com.shk.entity.Music;
import com.shk.service.MusicService;

public class MusicServiceImpl implements MusicService{
	
	MusicDao md = new MusicDaoImpl();
	@Override
	public List<Music> searchByKeyword(String keyword) {
		return md.queryByKeyword(keyword);
	}
	
	

}
