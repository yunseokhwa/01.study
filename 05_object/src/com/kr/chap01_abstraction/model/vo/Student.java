package com.kr.chap01_abstraction.model.vo;



/*
 * *클래스의 구조 
 * public class 클래스명 {
 * 
 *  // 필드부
 * // 생성자부
 * //메소드부
 *  public void method1(){
 *
 *  }
 *  }
 */

public class Student {//학생을 추상화 해서 만든 클래스 (완벽한 상태는 아님)

	//필드부
	//접근제한자 [예약어] 자료형 변수명
	
	
	//* 접근제한자 : 여기에 접근할수 있는 범위를 제한하는것
	//       public > prtected > default >private 
	
	public String name; // 이름
	public int age; //나이
	public double heigeht; //키
	
}
