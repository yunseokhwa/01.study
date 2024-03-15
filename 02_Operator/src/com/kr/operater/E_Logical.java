package com.kr.operater;

import java.util.Scanner;

public class E_Logical {
	
	
		
		/*
		 * *논리 연산자(이황연산자)
		 *  두개의 논리값을 연산해주는 연산자 
		 *  논리연산한 결과 마져도 논리값임!!
		 *  
		 *  
		 *  논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true 일 경우 결과값 은 true 
		 *  논리값 || 논리값 : 왼쪽과 호른쪽 둘중에  하나라도 true 일 경우 결과값은 true
		 * 
		 * 
		 */
		
		
    public void method1() {
			//사용자가 입력한 정수값 이 1부터 100 사이 값인지 확인 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 하나 입력 :");
	int  num = sc.nextInt();
	//boolean result = (1< num <= 100);
	
	boolean result = (num >=1)&& (num <100); // num 값이 1이상 "이고" "그리고" num 값이 100이하 일경우
    
    // &&의미 : ~이고 , 그리고 , ~ 하면서
	
	System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : "+result);
	// && : 두개의 조건 모두가 true 여야 && 연산의 결과값이  최종적으로 true
	//둘중에 하나라고 false 가있을 경우 && 연산의 결과값은 false
	
	     	 
	
	}
    
    
    
    public void method2() {
    	//사용자가 입력한 문자값이 영어 대문자 인지 확인 
    	//'A' ~'Z' :65~90
    	
       Scanner sc = new Scanner(System.in);
       
       System.out.println("문자 하나입력 :");
       char ch = sc.nextLine().charAt(0);
       
       //boolean resukt = (65<= ch <=90);
       
       // 첫번째 방법 
       //boolean result = (65<= ch <=90);
       //두번째 방법 
       boolean result =(ch >='A')&&(ch <='Z');
       
       System.out.println("사용자가 입력한 값이 대문자 입니까? :" + result);
    }
    
    public void method3() {
    	// 사용자에게 성별을 입력 받은 후 여자인지 확인 
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("성별을 입력해주세요(M/F):");
    	
    	char gender = sc.nextLine().charAt(0);
    	
    	boolean result = (gender== 'F')|| (gender =='f');
    	
    	System.out.println("사용자가 여자 입니까?" + result);
    	
    	// || : 두개의 조건 중 하나 라도 true 가 있다면 || 연산의 결과 같은 true
    	// 두개의 조건 모두 false 일경우 || 연산의 결과 같이 false
    	
    	
    }
    
    
    public void method4() {
    	// 사용자가에게 입력을 받아 게임을 종류하는 프로그램 
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("게임을 종류하시려면 y 를 입력해주세요:");
    	
    	char ch = sc.nextLine().charAt(0);
    	
    	boolean result = (ch== 'y')|| (ch == 'y');
    	
    	System.out.println("사용자가 입력한 값이 y또는 y 입니까? " + result);
    }
    
    /*
     * && :두개의 조건이 모두 true 임 (AND == ~이고 , 그리고 , ~ 이면서 , 뿐만 아니라)
     * 
     * true %% true => true
     * true %% false => false
     * false %% true => false
     * false %% false => false 
     * 
     * ** && 연사를 기준으로  앞의 결과가 false 일경우 뒤의 조건은 굳이 실행하지 않는다 !!
     * 
     * || 두개의 조건 중 하나라도 true 결과값이 true 임 (OR == 또는 , 이거나 
     * 
     * true || true => true 
     * true || false => true 
     * false || true => true
     * 
     * ** || 연산자 기준으로 앞의 결과가 true 일경우 뒤의 굳이 실하지 않는다ㅣ!!
     * 
     * 
     */
    
      public void method5() {
    	  int num =10;
    	  
    	  boolean result1 = (num >5) && (++num >0);
    	  System.out.println("result1 :" + result1);
    	  System.out.println("&& 연산 후의 num2 값 :" + num);
    	  
    	  int num2 = 10;
	      //boolean result2 = (num2 > 20) || (++num2 > 0);
	      boolean result2 = true || (++num2 > 0); // Dead Code : 절대 실행될일 없는 코드
	      
	      System.out.println("result2 : " + result2);
	      System.out.println("|| 연산후의 num2값 : " + num2);
      }
    

}
