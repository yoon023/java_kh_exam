package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;


public class AscTitle implements Comparator<Music>{
	
//	public int compare(Object o, Object o2) {
//		int result = 0;
//		//TODO
//		return result;
//	}

	@Override
	public int compare(Music o1, Music o2) {
		int result = 0;
		result = o1.getTitle().compareTo(o2.getTitle());
		// TODO Auto-generated method stub
		return 0;
	}
}
