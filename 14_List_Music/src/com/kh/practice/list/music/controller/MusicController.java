package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
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
			if (vo.getTitle().equals(title)) {// 타이틀이 같은 것을 찾아
				result = vo;// 찾은 뮤직 객체 vo를 리턴하면 됨
				break;
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {// 타이틀이 같은 것을 ㅍ찾아
				list.remove(vo);
				result = vo;// 찾은 뮤직 객체vo를 리턴하면 됨.
				break;
			}
		}
		return result;
	}

	public Music setMusic(String title, Music music) {
		Music result = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
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
		try {
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - 1 - i; j++) {
					if (list.get(j).getTitle().compareTo(list.get(j + 1).getTitle()) > 0) { // 오름차순
						// SWAP
						Music tmp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, tmp);
					}
				}
			}

			result = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}

	public int descSinger() {
		// 착각하지 말자 list에서 singer는 없다. list의 1개 객체에서 singer가 있다.
		// 즉 , list.get(0).getSinger();

		int result = 0;
		try {

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - 1 - i; j++) {
					if (list.get(j).getSinger().compareTo(list.get(j + 1).getSinger()) < 0) { // 내림차순 음수가 나오면 바꿔줌
						//정렬기준은 list의 Music 형태의 객체 중 singer 값으로 비교함.
						// SWAP //list에 있는 Music형태의 객체를 swap
						Music tmp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, tmp);
					}
				}
			}

			result = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}
	public int ascTitle2() {
		int result = 0;
		
		return result;
	}
	public int descSinger2() {
		int result = 0;
		Collections.sort(list);
		return result;
		
	}
}
