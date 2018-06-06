package com.shk.dao;

import java.util.List;

import com.shk.entity.Music;

public interface MusicDao {
	public List<Music> queryByKeyword(String keyword);
	
}
