package com.kr.chap02_encapsulation.model.vo;

public class Student {//나만의 자료형
	
	// 필드명으로 작성
	
	//접근제한자 자료형 변수명
     private String name;
     private int age;
     private double height;
     private int KorScre;
     private int mathScore;
     
     
     
     /*
      * 
      * 메소드
      * [표현법]
      * 접근제한자 반환형 메소드명 ([메개변수]) {
      * 
      * ... 실행 할 코드
      * 
      * 
      */
    /* public void method1(int a) {//매게변수 :전달되는 변수
    	 System.out.println(a);
     }
     */
     
     // - Setter 메소드 
     //해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입시켜주는 기능의 메소드
    
     public void setName (String name) {//매개변수 필드부 이름과 동일하게 짓는것 => 관례적인 표현
    	// System.out.println(newName);
    	 //매개변수 :해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문 (이메소드 내에서만 사용가능 )
    	// 필드부 name =매개변수 name;원함!!
    	 this.name =name; // this :해당 객체의 주소값이 담겨 있음
    	 // 필드명과 매개변수명이 동일한 시점에서  해당 메소드 영역에서 만들어진 변수가 우선순위가 더 높음
    	 
     }
     
     public void setAge(int age) {
    	 this.age =age;
    	 
     }
     public void setHeight(double height) {
    	 this.height = height;
     }
     
     public void setKorScore(int korScore) {
    	 this.KorScre=korScore;
    	 
     }
     public void setMathScore(int mathScore) {
     this.mathScore=mathScore;
	 
} 
     
     // -getter메소드
     // 해당 필드에 담긴 값을  반환 해주는 역활 을 수행
     
     public String getName() {
    	 return name;
     }
     
     public int getAge() {
    	 return age;
     }
     
     public double getHeight() {
    	 return height;
     }
     
     
     public int getKorScore() {
    	 return KorScre;
     }
     
     public double getMathScore() {
    	 return mathScore;
     }
     
}