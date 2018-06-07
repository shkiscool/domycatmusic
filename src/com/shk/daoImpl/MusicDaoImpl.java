package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.MusicDao;
import com.shk.entity.Music;
import com.shk.util.DBUtil;
import com.shk.util.PageData;

public class MusicDaoImpl implements MusicDao {

	@Override
	public List<Music> queryByKeyword(String keyword) {
		String sql = "select MID as \"mId\", TID as \"tId\", SINGERID as \"singerId\", MNAME as \"mName\", MURL as \"mUrl\", MCOUNT as \"mCount\", MIMG as \"mImg\", SINGERNAME as \"singerName\", MTIME as \"mTime\" from MUSIC where mName like ? or singerName like ?";
		List<Music> list = (List<Music>) DBUtil.select(sql, Music.class, "%" + keyword + "%", "%" + keyword + "%");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PageData<Music> query(int page, int pageSize, String musicLike) {
		String sql = "select MID as \"mId\", TID as \"tId\", SINGERID as \"singerId\", MNAME as \"mName\", MURL as \"mUrl\", MCOUNT as \"mCount\", MIMG as \"mImg\", SINGERNAME as \"singerName\", MTIME as \"mTime\" from MUSIC where MNAME like ? or SINGERNAME like ?";

		return DBUtil.getOraclePage(sql, page, pageSize, Music.class, "%" + musicLike + "%","%" + musicLike + "%");
	}
	@Override
	public boolean addMusic(Music music) {
		return DBUtil.execute("insert into MUSIC values(?,?,?,?,?,?,?,sysdate,?,?,?)", music.getmId(), music.gettId(),
				music.getSingerId(), music.getmName(), music.getmUrl(), music.getmCount(), music.getmLyric(),
				music.getmImg(), music.getSingerName(), music.getmTime()) > 0;
		// MID,TID,SCENEID,MODEID,GENREID,LANGUAGID,SINGERID,MNAME,MURL,MCOUNT,MLYRIC
	}

	@Override
	public boolean delMusic(int musicId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from MUSIC where MID = ?", musicId) > 0;
	}

	@Override
	public List<Music> queryAllMusic() {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC",
				Music.class);
		return list;
	}

	//勾思奇：修改返回值类型
	@Override
	public List<Music> queryMusicById(int musicId) {
		// TODO Auto-generated method stub
		return (List<Music>) DBUtil.getFirst(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where MID = ?",
				musicId);
	}

	@Override
	public List<Music> queryMusicByTypeId(int typeId) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where TID = ?",
				Music.class, typeId);
		return list;
	}

	@Override
	public List<Music> queryMusicBySingerId(int singerId) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where SINGERID = ?",
				Music.class, singerId);
		return list;
	}

	@Override
	public List<Music> queryMusicBySingerName(String singerName) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where SINGERNAME like ?",
				Music.class, "%" + singerName + "%");
		return list;
	}

	@Override
	public List<Music> queryMusicByMNameOrSingerName(String name) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where MNAME like ? or SINGERNAME like ?",
				Music.class, "%" + name + "%");
		return list;
	}

	@Override
	public List<Music> queryMusicByAnyWord(String str) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select(
				"select mId as \"mId\",tId as \"tId\",singerId as \"singerId\",mName as \"mName\",mUrl as \"mUrl\",mCount as \"mCount\",mLyric as \"mLyric\",mDate as \"mDate\",mImg as \"mImg\",singerName as \"singerName\",mTime as \"mTime\" from MUSIC where MNAME like ? or SINGERNAME like ? or MLYRIC like ?",
				Music.class, "%" + str + "%", "%" + str + "%", "%" + str + "%");
		return list;
	}

}
