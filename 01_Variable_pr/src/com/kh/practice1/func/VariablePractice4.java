package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세개를 출력하세요.
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 :");
		String str = sc.nextLine();
		
		System.out.println("첫번째문자 :" + str.charAt(0));
		System.out.println("두번째문자 :" + str.charAt(1));
		System.out.println("세번째문자 :" + str.charAt(2));
	}

}
