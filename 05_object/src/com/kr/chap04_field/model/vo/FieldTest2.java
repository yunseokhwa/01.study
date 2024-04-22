package com.kr.chap04_field.model.vo;

public class FieldTest2 {
	//필드들의 접근제한자 를 테스트 해보기 위한 클래스 
	
	
			// 필드들의 접근 제한자를 테스트 해보기 위한 클래스 
			/*
			 * * 필드(멤버변수)에서 사용가능한 접근제한자 4가지 
			 * 
			 * public      => 어디서든(같은패키지, 다른패키지, 모두) 접근 가능 
			 * protected   => 같은 패키지 접근 가능, 다른 패키지일 경우 상속구조(부모자식간의 관계)에서는 접근 가능 => 나중에 다시 공부
			 * default      => 같은 패키지에서만 접근 가능 (다른 패키지일 때는 절대 불가 !!)
			 * private      => only 해당 클래스에서만 접근 가능
			 * 
			 * 위에서부터 아래로 내려갈수록 접근 할 수 있는 범위가 좁아짐.
			 */
	//public class FieldTest2{ // 클래스 시작
	
	public String pub ="public";
	protected String pro ="Protected";
	String def ="default"; //안쓰면 default 임
	private String pri = "private";
	
	public static String sta = "static_FieldTest2";
	

}
