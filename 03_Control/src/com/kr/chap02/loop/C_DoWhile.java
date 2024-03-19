package com.kr.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	
	/*
	 * *do-while문
	 * 
	 * do{
	 *     반복적으로 실행할 코드 (무조건 실행!!)
	 *    }while(조건문);
	 *    
	 *    
	 *   첨에 무조건 실행코드 실행 **
	 *   --> 조건식 검사 ---> true 일경우 실행코드 실행
	 *   --> 조건식 검사 --> true 일경우 실행코드 실행 
	 *   --> 조건식 검사 --> true 일경우 실행코드  x=>반복문 빠져나감 
	 *   
	 *  * 기존의  for문 / while문과의 차이점 
	 *  for/while 문 같은 경우에는 조건 검사후에 true여야만 실행
	 *  근데 do-while문은 조건검사없이 무조건 !!  한번은 수행함 
	 *  
	 * 
	 */
	
	 public void method1() {
		 int num =1;
		 do {
			 System.out.println(num);
			 
		 }while(false);// 대놓고 false임
		 //조건이 애초에 맞지 않아도 무조건 한번은 실행함
		 
	 }
	 
	 public void method2() {
		 //1 2 3 4 5 
		 int i= 1;
		 do {
			 System.out.print(i+"");
			 i++;
			 
		 }while(i<=5);
	 }
	 
	 public void method3() {
		 //1에서 부터 사용자가 입력한 수 까지의 총 합계
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자입력 :");
		 int num = sc.nextInt();
		 
		 //1.sum 변수 만들기
		 int sum = 0;
		 //2.누적합 공식 이용해서 반복문 돌리기 =>sum +1;
		 
		 int i =0;
		      do {
		    	  sum+=i;
		    	  i++;
		    	  
		      }while(i<=num);
		      
		      System.out.println("1부터 " + num +"까지의 총합계:" +sum);
	 }

}
