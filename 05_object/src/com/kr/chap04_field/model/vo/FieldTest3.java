package com.kr.chap04_field.model.vo;
// 클래스 변수(static 변수), 상수 필드에 대해서 알아보기
public class FieldTest3 {

	 //static 은 공유의 개념
	//static이 붙은 애들은 프로그램 실행과 동시에 메모리의 static 영역에 올라감
	//프로그램 실행과 동시에 메모리 상에 한번만 올려놓고 여기저기서 가져다 쓰는 개념
	// public 이랑 같이 쓰자!
	
	public static String sta ="static_FieldTest3";
	
	// static :공유의 개념
	// final : 상수의 개념 (한번 지정괸 값 변경 x)
	
	public static final String STA_FIN = "static Final";
}
