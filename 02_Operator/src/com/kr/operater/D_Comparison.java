package com.kr.operater;

import java.util.Scanner;

public class D_Comparison {
	
	/*
	 * * 비교연산자 / 관계 연산자 (이항연산자)
	 * 두값을 비교하는 연산자 
	 * 비교연산자는 조건을 만족하면 true(참) , 만족하지 않으면 false(거짓) 을 반환
	 * 즉 , 비교연산 결과는 논리값!!
	 * 동등 비교 연산자 :== !=
	 * 
	 * 
	 */
	
	public void method1 () {
		// int a=10, b=25가능하긴 하나 ,권장하지는 않는다. 가독성
		
		int a =10;
		int b =25;
		System.out.println("a == b:" +(a == b));// faslse
		System.out.println("a <= b:" +(a <= b));// true
		
		
		boolean result =( a>b); // false
	    System.out.println("a >b " + result);
	    
	    //산술연산 + 비교연산
	    System.out.println((a *2)>(b / 5));
	    System.out.println("a 가 짝수인가 :" + (a % 2==0));
	    
	    System.out.println("a 가 홀수인가 :" + (a % 2!=0));// 비교연산
	    System.out.println("a 가 홀수인가 :" +!(a % 2==0));// 논리부정
	    
	    // 2를 나눴을때 의 나머지가 0일 경우 == 2로 나눠 떨어진다는 의미 == 짝수
        //              나머지가 1일 경우 == 2로 나눠 떨어진다는 의미 == 홀수
	    
	}
	
	
	
	
	 public void method2() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("첫번째 정수 :");
		 int num1 = sc. nextInt();
		 
		 System.out.print("두번째 정수 :");
		 int num2 = sc.nextInt();
		 
		 System.out.println("첫번쨰가 두번쨰 보다 큽니까? :" + (num1 > num2));
		 System.out.println("첫번쨰 정수가 짝수 입니까? : " + (num1 % 2 == 0));
		 
		 
		 //특이 케이스 (문자와 숫자간의 대소비교가 가능 !!)
		 System.out.println(num2 < 'A');
		 // 'A' ~ 'Z' : 65~90
		 
	 }

}
