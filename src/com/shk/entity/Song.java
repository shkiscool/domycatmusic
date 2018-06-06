package com.shk.entity;

public class Song {
	private String poster; // ¸èÇúÍ¼Æ¬
	private String artist; // ¸èÊÖÃû³Æ
	private String title; // ÒôÀÖÃû³Æ
	private String mp3; // ÒôÀÖÁ´½ÓÂ·¾¶
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song( String title, String mp3,String poster, String artist) {
		super();
		this.poster = poster;
		this.artist = artist;
		this.title = title;
		this.mp3 = mp3;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMp3() {
		return mp3;
	}
	public void setMp3(String mp3) {
		this.mp3 = mp3;
	}
	@Override
	public String toString() {
		return "poster:" + "\"" + poster + "\"" + ", artist:" + "\"" + artist + "\"" + ", title:" + "\"" + title + "\"" + ", mp3:" + "\"" + mp3 + "\"";
	}
	
	
}
