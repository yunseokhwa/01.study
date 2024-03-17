package com.kr.operater;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * *삼항 연산자 (항목을 3개를 가지고 연산해주는 연산자 )
	 * 
	 * [표현법]
	 * 조건식 ? 조건식이 참일경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 값 
	 * 이때 , 조건식은 반드시 !! true , false 가 나오도록 작성해야됨
	 * 주로 비교 , 논리 연산자 르르 통해서 작성할꺼임 
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		//입력받은 정수 값이 양수인지 아닌지 판별후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 ");
		int num = sc.nextInt();
		
		//String result =(num >0) "양수입니다.":"양수가 아닙니다.";
		
		 System.out.println(num + "은(는)" + ((num >0) ?"양수입니다 .": "양수가 아닙니다 ."));
		 
		 
		}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별후 출력
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수값 입력 :");
		int num = sc.nextInt();
		
		String result = num % 2 ==0? "짝수이다." :"홀수이다.";
		
		System.out.print(num + "은(는)" + result);
	}
	
	public void method3() {
		//사용자에게 종료 여부를 입력받아 판별해서 출력
		// 종료하시려면 y 를 입력해주세요 :
		//'y'이거나 'y'인경우에는 => 프로그램을 종료합니다.
		//        아닌 경우에는 => 계속 진행하겠습니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하시려면 y 를 입력해주세요:");
		char ch = sc.nextLine().charAt(0);
		String result = (ch == 'y') || (ch == 'y')? "프로그램을 종료 합니다":"계속 진행하겠습니다";
		
	    System.out.println(result);
	}
	
	public void method4() {
		// 입력받은 문자 값이 영어 소문자 인지 아닌지 판별후 출력
		
		Scanner sc = new Scanner(System.in);
		//영문자 입력 : 
		System.out.println("영문자 입력");
		char ch = sc.nextLine().charAt(0);
		//소문자를 입력한 경우 => 소문자 입니다 .
		// 대문자를 입력한 경우 => 소문자 가 아닙니다
		
		String result = (ch >= 'a' && ch <= 'z')? "소문자가 아닙니다.": "소문자가 아닙니다.";
		
		System.out.println(result);
	}
	
	public void method4_1() {
		//사용자에게 숫자를 입력받아
		//0보다 큰지 작은지 판별하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나입력 :");
		
		int num = sc.nextInt();
		
		String result =(num >0) ? "0보다 큽니다." : "0또는 0보다 작습니다.";
		System.out.println("입력하신 숫자"+ num +"은(는)" +result);
		
		
	}
   
	public void method5() {
		//사용자가 입력한 정수값이 
		//양수인지 ,음수인지 , 0 인지 를 정확하게 판별한 후 출력
		//삼항 연산자 중첩
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 :");
		int num = sc.nextInt();
		
		String result = (num >0 ) ? "양수입니다 ." :(num == 0) ? "0입니다." :"음수입니다.";
		
		System.out.println(num + "은(는)" + result);
	}	
		
     public void method6() {
			//사용자가 두개의 정수값 입력받고
			// + 또는 -를 입력받아 그에 맞는 연산결과 출력
			// 단 , +또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다" 출력
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int num1 = sc.nextInt();
		
		
		System.out.print("두번쨰 정수:");
		int num2 = sc.nextInt();
		
		// 버퍼에 남아있는 엔터 제거를 위한 코드 작성
		sc.nextLine();
		
		System.out.print("연산자 입력(+또는 -) :");
	 
		char op = sc.nextLine().charAt(0);
		
		String result =(op == '+') ? num1 + num2 + "" :(op == '-') ? num1 - num2 + "": "잘못입력했습니다";
    	 
		
		System.out.println("결과 :" + result);
		
	}

}