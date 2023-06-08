package com.kh.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BubbleSort {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		// SWAP
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a); // 20
		System.out.println(b); // 10

		// 버블정렬
		int[] arr = new int[] { 3, 2, 5, 1, 6, 8 };
		// 배열 ==> List
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 오름차순
//				if(arr[j] < arr[j+1]) { //내림차순 
					// SWAP
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println(arr);
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");

		String[] nameArr= new String[] { "손범규", "천영준", "유청하", "김민성" };
		// 배열 ==> List
		System.out.print("[");
		for (String namear : nameArr) {
			System.out.print(namear);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < nameArr.length - 1; i++) {
			for (int j = 0; j < nameArr.length - 1 - i; j++) {
				if (nameArr[j].compareTo(nameArr[j + 1]) > 0) { // 오름차순 양수가 나오면 바꿔줌 
//					if (nameArr[j].compareTo(nameArr[j + 1]) < 0) { // 내림차순 음수가 나오면 바꿔줌
					// SWAP
					String tmp = nameArr[j];
					nameArr[j] = nameArr[j + 1];
					nameArr[j + 1] = tmp;
				}
			}
		}
		System.out.print("[");
		for (String namear : nameArr) {
			System.out.print(namear);
			System.out.print(",");
		}
		System.out.println("]");
		System.out.println("========");
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String names = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(names, ",");
		List<String> nameList = new ArrayList<String>();
		while (strToken.hasMoreTokens()) {
			nameList.add(strToken.nextToken());
		}
		// 버블 정렬하기


		
	}
}
