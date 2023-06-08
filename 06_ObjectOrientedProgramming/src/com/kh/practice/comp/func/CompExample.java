package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	private Scanner sc = new Scanner(System.in);
	public void recursive() {
		
		recursive(); 
	}
	//! 계산 

	public void practice4() {
		// TODO Auto-generated method stub

		while (true) {
			System.out.print("문자열:");
			String str = sc.nextLine();
			System.out.print("문자:");
			char c = sc.nextLine().charAt(0);
			System.out.print("포함된 개수:");
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					count++;
				}
			}
			System.out.println("포함된 개수:" + count);
			boolean exit = false; // while(true) 문자열을 끝내고 나갈 수 있도록 하기 위한 변수
			while (true) {
				System.out.print("더 하시겠습니까?(y/n) :");
				String strContinue = sc.nextLine().toLowerCase();
				if (strContinue.equals("y")) {
					break;
				} else if (strContinue.equals("n")) {
					exit = true; // 문자열을 끝낼 수 있도록 트루 대입
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			} // while(true)"더 하시겠습니까?(y/n) :"
			if (exit) {
				break;
			}
		} // while(true)"문자열:"
	}

	public void practice4_1() {
		// TODO Auto-generated method stub

		String strContinue = "";
		do {
			System.out.print("문자열:");
			String str = sc.nextLine();
			System.out.print("문자:");
			char c = sc.nextLine().charAt(0);
			System.out.print("포함된 개수:");
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					count++;
				}
			}
			System.out.println("포함된 개수:" + count);
			while (true) {
				System.out.print("더 하시겠습니까?(y/n) :");
				strContinue = sc.nextLine().toLowerCase();
				if (strContinue.equals("y")) {
					break;
				} else if (strContinue.equals("n")) {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}//while(true)"더 하시겠습니까?(y/n) :"
			
			
		}while(strContinue.equals("y"));
		System.out.println("======끝======");
	}
}
