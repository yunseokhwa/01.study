package com.kr.chap06_method.controller;

public class NonStaticMethod {

	/*
	 ** 메소드 
	 * 한기능을 처리하기 위한 용도 
	 * 
	 * 패기지명 : 소문자로 시작 
	 * 클래스명 : 대문자로 시작
	 * 변수명 : 소문자로 시작 
	 * 메소드명 : 소문자로 시작 
	 * 
	 * 공통 :낙타 표기법 (camel case)
	 * 
	 * 접근제한자 반환형[예약어] (반환할 값의 자료형 ) 메소드명 ([매개변수1,매개변수2,...]) {
	 *         수행내용 
	 *         [ reture 결과값 ;]
	 * 
	 * 
	 * 
	 * }
	 */
	//1. 매개변수 없고 반환값도 없는 메소드
	public void method1() {
		//return 0; => 반환값이 없어야 한다.
		System.out.println("매개변수와 반환값이 둘다 없는 메소드 입니다");
	}
	
	//2.매개변수 없고 반환값이 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없고 반환값이 있는 메소드 입니다.");
		return "아 집에 가고싶다 ..";
	}
	//3.매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드 입니다");
		if(num2 !=0) {
			System.out.println("num1/ num2 :"+ num1/ num2);
		}else {
			System.out.println("0으로 나눌수 없습니다 .");
		}
	}
	 //매개 변수 도 있고  반환값도 있는 메소드 
	//문자열 과 정수값 전달 받아서 해당 문바열 의 해당하는 정수 인덱스 의 문자값을 뽑아서 반환
     //apple,2 => p 를 돌려주는 
	public char method4(String str, int index) {//0~4
		 
		 /*
		if(index>=0 && index<str.length()) {
			return str.charAt(index);
		}else {
			return ' ' ;
		}
			*/
		return str.charAt(index);
	}

}
