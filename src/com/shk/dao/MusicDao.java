package com.shk.dao;

import java.util.List;

import com.shk.entity.Music;
import com.shk.util.PageData;

public interface MusicDao {

	public List<Music> queryByKeyword(String keyword);

	/**
	 * ��ҳ��ѯ���ֵķ���
	 * 
	 * @param page
	 *            ��ǰҳ��
	 * @param pageSize
	 *            ��ҳ�����ʾ��
	 * @param musicLike
	 *            ��ѯ�ַ���
	 * @return PageData<Music>
	 */
	PageData<Music> query(int page, int pageSize, String musicLike);
	/**
	 * ��Ӹ���
	 * @param music ��������
	 * @return ����true��ӳɹ�  false���ʧ��
	 */
	public boolean addMusic(Music music);
	/**
	 * ɾ������
	 * @param musicId ����ID
	 * @return ����trueɾ���ɹ� falseɾ��ʧ��
	 */
	public boolean delMusic(int musicId);
	/**
	 * �������еĸ���
	 * @return �����б�
	 */
	public List<Music> queryAllMusic();
	/**
	 * ͨ������ID��������
	 * @param musicId ����ID
	 * @return ����һ�׸�
	 */
	public Music queryMusicById(int musicId);
	/**
	 * ͨ������������ID����ͬһ�����ͻ���ĸ���
	 * @param typeId ����ID
	 * @return �����б�
	 */
	public List<Music> queryMusicByTypeId(int typeId);
	/**
	 * ͨ�����ֵ�ID���������ֵĸ���
	 * @param singerId ����ID
	 * @return �����б�
	 */
	public List<Music> queryMusicBySingerId(int singerId);
	/**
	 * ͨ�����ֵ����ֽ���ģ����ѯ���ֵĸ�
	 * @param singerName ���������а������ַ���
	 * @return �����б�
	 */
	public List<Music> queryMusicBySingerName(String singerName);
	/**
	 * ͨ���������߸������ƽ���ģ����ѯ
	 * @param name ��������������а������ַ���
	 * @return �����б�
	 */
	public List<Music> queryMusicByMNameOrSingerName(String name);
	/**
	 * ͨ���������ƻ�������ƻ���ģ����ѯ
	 * @param str �������ƻ�������ƻ��ʰ������ַ���
	 * @return �����б�
	 */
	public List<Music> queryMusicByAnyWord(String str);
	
//	public List<Music> queryFavoriteMusicByUserNameAndPwd(String userName,String userPwd);

}
