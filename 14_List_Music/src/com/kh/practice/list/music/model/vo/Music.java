package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music extends Object {
	private String title;
	private String singer;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		//TODO
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
//		if(singer.equals("bbb")) {
//			
//		}
		//TODO
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public int compareTo(Object o) {
		int result = 0;
		//TODO 
		return result;
		
	}
	
	public Music() {}
	
	
}
