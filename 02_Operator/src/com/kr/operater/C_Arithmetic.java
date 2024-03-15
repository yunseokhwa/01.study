package com.kr.operater;

public class C_Arithmetic {

	
	/*
	 * * 산술 연산자 ( 이항연산자 == 두개의 값을 가지고 연산 )
	 *  + - *  /  %
	 * 
	 * 
	 * *  /  %  >  + -
	 * 
	 */
	
	
  public void method1() {
	  int num1 = 10;
	  int num2 = 3;
	  
	  // system.out.println("num1 + num2);// 103 이나옴
	  System.out.println("num1 + num2");// 13
	  
	  //system.out.println("num1-num2 = "+num1-num2); // 에러 발생 우선 순위 때문에 : 문자 - 숫자 불가 
	  
	  System.out.println("num1-num2=" + (num1-num2));//7
	  System.out.println("num1*num2=" + (num1*num2));// 곱셉연산은 우선순위 먼저 ! 가독성위해 ()
	  System.out.println("num1/num2=" + (num1/num2));// 나누기 했을때 몫
	  System.out.println("num1 % num2 = " + (num1%num2));//나누기 했을때 나머지 
	  
	  //값 % 2 == 0 이라는건 짝수란 소리
	  //값 % 2 == 1 이라는건 홀수란 소리 
	  
	  
	  //값 % 5 == 0 이라는 건  5의 배수란 소리 
	  // 값 % 3 == 0 이라는 건 3의 배수란 소리 
	  
  }
}
