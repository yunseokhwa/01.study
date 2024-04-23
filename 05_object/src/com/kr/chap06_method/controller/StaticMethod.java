package com.kr.chap06_method.controller;

public class StaticMethod {
	
	//1. 매개변수도 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값이 둘다 없는 Static 메소드 입니다.");
	}
	//2. 매개변수는 없고 반환값은 있는 메소드
	public static int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 static 메소드 입니다.");
		
		//1 부터 랜던값(1~100)까지의 총합계
		int random =(int)(Math.random() * 100 +1);
		
		int sum = 0;
		for (int i= 1; i< random; i++) {
			sum += 1;
		}
		return sum;
	}
	
	// 매개변수도 있고 반환값도 있는 메소드
	// 문자열과 정수값 전달 받아서 해당 문자열의 해당하는 정수 인덱스 의 문자값을 뽑아서 반환
	// apple,2 => p 를 돌려주는
	//3. 매개변수는 있고 반환값은 없는 메소드
	public static void method3(String name) {
		System.out.println("매개변수 있고 반환값은 없는 static 메소드 입니다.");
		System.out.println(name + "님의 방문을 환영합니다.");

	}

	public char method4(String Str, int index) {
		return Str.charAt(index);
	}

//4. 매개변수와 반환값이 둘다 있는 메소드 
	public static boolean method4(String Str1, String Str2) {
		System.out.println("매개변수와 반환값 둘다 있는 static 메소드 입니다.");

		/*
		 * if (Str1.equals(Str2)) { return true; }else { return false; }
		 */
		return Str1.equals(Str2);
	}

}
