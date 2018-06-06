package com.shk.service;

import java.util.List;

import com.shk.entity.Music;
import com.shk.entity.Song;
import com.shk.util.PageData;

/**
 * ���ʸ������ݿ��service��ӿ�
 * @author gousq 2018��6��5�� 
 * ��ʱ�ṩ�˹ؼ��������ķ����������밴���󲹳����
 */
public interface MusicService {
	
	public List<Music> searchByKeyword(String keyword);
	
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
	PageData<Music> getMusic(int page,int pageSize, String musicLike);
	
	
	/**
	 * ��Musicת����Song��ʽ
	 * @param list Music�ļ���
	 * @return	Song���ַ���
	 */
	public String changeToSongStr(List<Music> list);
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
	public List<Music> getAllMusic();
	/**
	 * ͨ������ID��������
	 * @param musicId ����ID
	 * @return ����һ�׸�
	 */
	public Music getMusicById(int musicId);
	/**
	 * ͨ������������ID����ͬһ�����ͻ���ĸ���
	 * @param typeId ����ID
	 * @return �����б�
	 */
	public List<Music> getMusicByTypeId(int typeId);
	/**
	 * ͨ�����ֵ�ID���������ֵĸ���
	 * @param singerId ����ID
	 * @return �����б�
	 */
	public List<Music> getMusicBySingerId(int singerId);
	/**
	 * ͨ�����ֵ����ֽ���ģ����ѯ���ֵĸ�
	 * @param singerName ���������а������ַ���
	 * @return �����б�
	 */
	public List<Music> getMusicBySingerName(String singerName);
	/**
	 * ͨ���������߸������ƽ���ģ����ѯ
	 * @param name ��������������а������ַ���
	 * @return �����б�
	 */
	public List<Music> getMusicByMNameOrSingerName(String name);
	/**
	 * ͨ���������ƻ�������ƻ���ģ����ѯ
	 * @param str �������ƻ�������ƻ��ʰ������ַ���
	 * @return �����б�
	 */
	public List<Music> getMusicByAnyWord(String str);
	
//	public List<Music> getFavoriteMusicByUserNameAndPwd(String userName,String userPwd);

}
