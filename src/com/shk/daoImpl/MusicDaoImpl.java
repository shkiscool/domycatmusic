package com.shk.daoImpl;
import java.util.List;

import com.shk.dao.MusicDao;
import com.shk.entity.Music;
import com.shk.util.DBUtil;

public class MusicDaoImpl implements MusicDao {

	@Override
	public List<Music> queryByKeyword(String keyword) {
		String sql = "select MID as \"mId\", TID as \"tId\", SINGERID as \"singerId\", MNAME as \"mName\", MURL as \"mUrl\", MCOUNT as \"mCount\", MIMG as \"mImg\", SINGERNAME as \"singerName\", MTIME as \"mTime\" from MUSIC where mName like ? or singerName like ?";
		List<Music> list = (List<Music>)DBUtil.select(sql, Music.class, "%"+keyword+"%","%"+keyword+"%");
		return list;
	}

}
