package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public MusicController() {
		// list에 초기 곡 10곡 미리 입력해두기
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "bbb"));
		list.add(new Music("cc", "ccc"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("ee", "eee"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("aa", "bbb"));
		list.add(new Music("ff", "aaa"));
	}

	public int addList(Music music) {
		int result = 0; // 0:추가 실패, 1:추가 성공
		if (list.add(music)) {
			result = 1; //
		}
		return result;
	}

	public int addAtZero(Music music) {

		int result = 0;
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;
	}

	public List<Music> printAll() {
		// TODO
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {//타이틀이 같은 것을 찾아
				result = vo;//찾은 뮤직 객체 vo를 리턴하면 됨
				break;
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {//타이틀이 같은 것을 ㅍ찾아
				list.remove(vo);
				result = vo;// 찾은 뮤직 객체vo를 리턴하면 됨.
				break;
			}
		}
		return result;
	}

	public Music setMusic(String title, Music music) {
		Music result = null;
		for(int i=0; i <list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for (Music vo : list) {
//			if (vo.getTitle().equals(title)) {//타이틀이 같은 것을 찾아
//				result = vo;//찾은 뮤직 객체 vo를 리턴하면 됨.
//				
//				//불가 vo = music; //vo는 for문의 새로운 지역변수로 list와는 무관한 공간임.
//				int findIdx = list.indexOf(vo);
//				list.set(findIdx, music);
//				break;
//			}
//		}
		return result;
	}

	public int ascTitle() {

		int result = 0;
		return result;
	}

	public int descSinger(int descSinger) {
		int result = 0;
		return result;
	}
}
