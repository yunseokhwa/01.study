package com.kr.practice.chap01;

import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;

public class Controlpractice {
public void practice1( ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력"); 
		System.out.println("2.수정"); 
		System.out.println("3.조회"); 
		System.out.println("4.삭제"); 
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요:");
		int menu = sc.nextInt();
		
	   switch(menu) {
	   
	   case 1 : 
		   System.out.println("입력 메뉴입니다");break;
	   case 2 :
		   System.out.println("수정 메뉴입니다");break;
	   case 3 :
		   System.out.println("조회 메뉴입니다");break;
	   case 4 :
		   System.out.println("삭제 메뉴입니다");break;
	   case 7 :
		   System.out.println("종료 메뉴입니다");break;
	   
	   }	
	  	
	}
public void practice2( ) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.print("숫자를 한 개를 입력하세요:");
	int num = sc.nextInt();
	 if(num>0) {// 양수일경우
     	if (num % 2 ==0) { // (양수이고) 짝수인 경우 
     	      System.out.println("짝수다");
           		  
     	}else { // (양수이고 ) 홀수인경우 
   		  System.out.println("홀수다");
         	   	  
     	  }
     }else { // 양수가 아닐 경우
     	System.out.println("양수가 아닙니다. 잘못입력하셨습니다.");
     }
     	
     	
	
	
	
	

}
	
public void practice3( ) {
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.print("국어점수 :");
     int  korea = sc.nextInt();
	
     System.out.print("수학점수 :");
     int  math = sc.nextInt();
	
     System.out.print("영어점수 :");
     int  english = sc.nextInt();
     
     int sum = korea + math + english;
     double avg = sum / 3.0;
     
     if(korea >= 40 && math >= 40 && english >= 40 && avg >= 60) {
    	 System.out.println("국어 : " + korea);
    	 System.out.println("수학 : " + math);
    	 System.out.println("영어 : " + english);
    	 System.out.println("합계 : " + sum);
    	 System.out.println("평균 : " + avg);
    	 System.out.println("축하합니다, 합격입니다!");
     }else {
    	 System.out.print("불합격 입니다.");
     }
     
    
	
	

     
     
     
     
     
     
     
}
	
public void practice4( ) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("1~12사이의 정수 입력:");
	int month = sc.nextInt();
	switch(month) {
	
	
	

	case 3:	
	case 4:	
	case 5:System.out.print("5월은 봄입니다. ");break;
	case 6:
	case 7:
	case 8:System.out.print("8월은 여름입니다. ");break;
	
	case 9:
	case 10:
	case 11:System.out.print("11월은 가을입니다. ");	break;
	
	case 12:
	case  1:
	case  2:System.out.print("2월은 겨울입니다. ");break;
	
	default:System.out.println("99월은 잘못 입력된 달입니다 .");
    
	
	}

	
}
	
	
	


public void practice5( ) {
	
	
	
	 String id= "Korea";
     String pw ="1234";
     
    Scanner sc =new Scanner(System.in);
     
     System.out.print("id입력:");
     String userId =sc.next();
     
     System.out.print("pw 입력:");
     String userPw =sc.next();
     
     if(id.equals(userId)&& pw.equals(userPw)) {
    	 System.out.println("로그인 성공");
     }else {
    	 if(id.equals(userId)) {
    		 System.out.println("비밀번호가 틀렸습니다 ");
    	 }else {
    		 System.out.println("아이디가 틀렸습니다");
    	 }
     
        
        
   
     }
}

public void Practice6() {
	Scanner sc = new Scanner(System.in);
	System.out.print("권한을 확인하고자 하는 회원등급:");
	String level =sc.nextLine();
	
	if(level.equals("관리자")) {
		System.out.println("회원관리,게시글관리,게시글 작성,게시글 조회,댓글작성");
		
	}else if(level.equals("회원")) {
	  System.out.println("게시글 작성, 게시글 조회, 댓글작성");
	  
	}else System.out.println("게시글 조회");
}
	
	
	
	
	
	
	
	public void practice7( ) {
	

	
	/*
	 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
저체중/정상체중/과체중/비만을 출력하세요.
BMI = 몸무게 / (키(m) * 키(m))
BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
BMI가 30이상일 경우 고도 비만
	 */
	Scanner sc = new Scanner(System.in);
		
	System.out.print("키를 입력해주세요:");
	double height = sc.nextDouble();
	
	System.out.print("몸무게를 입력해주세요 :");
	double weight = sc.nextDouble();
	
	
   double bmi = weight/ (height *height);
   System.out.println(bmi);
   
   if(bmi < 18.25) {
	   System.out.println("저체중");
   }else if(bmi <23) {
	   System.out.println("정상체중");
   }else if(bmi <25) {
	   System.out.println("과체중");
   }else if(bmi < 30) {
	   System.out.println("비만");
   }else {
	   System.out.println("고도비만");
   }
}	
	
	
	
	
	



public void practice8( ) {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	 * 
	 */
	System.out.print("피연산자 1입력:");
	int num1 = sc.nextInt();
	
	System.out.print("피연산자 2입력:");
	int num2 = sc.nextInt();
	
	sc.nextLine();
	System.out.print("연산자를 입력 (+,-,*,/,%):");
	char op = sc.nextLine().charAt(0);
	if ((num1> 0)&& (num2>0)) {//둘다 양수인 경우 
		
	switch(op) {
	case '-':
		System.out.printf("%d-%d = %d", num1,num2, num1-num2);
		break;
		default:
			System.out.println("잘못입력하였습니다.프로그램을 종료합니다");
	}
		
			
			
		

	
	
	
	}
}

public void practice9( ) {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 * 
	 */
	

    System.out.print("중간고사 점수 :");	
    double mScore = sc.nextDouble();
    
    System.out.print("기말고사 점수:");	
    double fScore = sc.nextDouble();
    
    System.out.print("과제점수:");
    double hScore = sc.nextDouble();
    
    System.out.print("출석점수: ");	
    double aScore = sc.nextDouble();
	
	if(aScore < 14) {
	System.out.println("============ 결과 ==============");
	System.out.println("Fail [출석 회수 부족 ("+ (int)aScore+"20)");
	}else {
		
		/*
		 * ================= 결과 =================
    중간 고사 점수(20) : 16.0
    기말 고사 점수(30) : 9.0
    과제 점수 (30) : 18.0
    출석 점수 (20) : 18.0
   총점 : 61.0
   Fail [점수 미달]
		 * 
		 * 
		 */
	System.out.println("======== 결과 ==========");	
	System.out.println("중간고사 (20):"+ (mScore= mScore *0.2));	
	System.out.println("기말고사 (30):" + (fScore = fScore * 0.3));	
	System.out.println("과제 점수 (30) :"+ (hScore = hScore*0.3));	
	System.out.println("과제 점수 (20):"+ aScore);	
		
	
    double sumScore = mScore +fScore + hScore +aScore;
    
    System.out.println("총점 : 61.0");
    
    if(sumScore >= 70) {
    	System.out.println("PASS");
    }if(sumScore <70) {
    	System.out.println("Fall[점수미달]");
    }
		
		
		
	
}
}

public void practice10( ) {
	
	Scanner sc = new Scanner(System.in);
	
	
	  System.out.print("실행할 기능을 선택하세요.\n1.메뉴 출력 \n2.짝수/홀수 \n3. 합격/불합격 "
              + "\n4. 계절 \n5. 로그인 \n6. 권한 확인 \n7. BMI \n8. 게산기 \n9. P/F \n선택 : ");
   
               int func = sc.nextInt();
               
               switch(func) {
               case 4:
            	   practice4();
            	   break;
               }
	     
               sc.close();
	
	
	
	

}
	

}	

	

	

	

	

	

	
	
	
	


