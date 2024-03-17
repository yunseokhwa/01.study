package com.kr.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		System.out.println((num >0)? "양수다" :"양수가 아니다");
		
	}

	public void practice2() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수:");
		int num =sc.nextInt();
		
		System.out.print((num==0)?"0이다:":"음수다");
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		int num =sc.nextInt();
		
		System.out.print((num%2==0)?"짝수다":"홀수다");
	}
	
	 public void practice4() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("인원수:");
		 int num1 =sc.nextInt();
		 System.out.print("사탕갯수:");
		 int num2 =sc.nextInt();
		 
		 System.out.println("1인당 사탕개수:"+(num2/num1));
		 System.out.println("남은사탕개수:"+(num2%num1));
		 
	 }
	 
	 
	 public void practice5() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름:");
		 String name = sc.nextLine();
		 System.out.print("학년(숫자만):");
		 int num2 =sc.nextInt();
		 System.out.println("반(숫자만):");
		 int num3 =sc.nextInt();
		 sc.nextLine();
		 System.out.println("번호(숫자만):");
		 int num4 =sc.nextInt();
		 System.out.print("성별(M/F):");
		 char gender = sc.nextLine().charAt(0);
		 System.out.print("성적(소수점아래 둘째짜리까지:");
		 double score = sc.nextDouble();
		 
		 
		 String student = (gender == 'M')? ("남학생"):("여학생");
		 
		 System.out.println(num2 +"학년" + num3 +"반" + num4 + "번"+name+ student+"의 성적은 " +score+"이다");
		 
	 }
	 
	 public void practice6() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("나이:");
		 int age =sc.nextInt();
		 
		 String result = age <= 13? "어린이": (age >13 && age <=19) ?"청소년":"성인";
		 System.out.println(result);
		 
		 
	 }
	 
	 
	 public void practioce7() {
		 //국어 , 영어, 수학에대한 점수를 키보드를 이용해 정수로 입력 받고
		 // 세과목에 대한 합계(국어+영어+수학) 와 평균 (합계/3.0)을 구하세요.
		 //세 과목의 점수와 평균을 가지고 합격여부를 처리하는데 
		 //세 과목 점수가 각각 40 점 이상이면서 평균이 60 점 이상일때 합격, 불합격을 출력하세요
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("국어:");
		 int korean =sc.nextInt();
		 
		 System.out.print("영어:");
		 int english =sc.nextInt();
		 System.out.print("수학:");
		 int math =sc.nextInt();
		 
		 int total =(korean +english + math);
		 double avrage = ((total)/3.0);
		 
		 System.out.println(total);
		 System.out.println(avrage);
	 }
	 
	 public void practice8() {
		 Scanner SC = new Scanner(System.in);
		 
		 System.out.print("주민번호를 입력하세요(-포함) : ");
		 String number = SC.nextLine();
		 
		 char gender = number.charAt(7);
		 
		 String result = (gender == '2') ? "여자" :"남자";
		 System.out.println(result);
		 
	 }
	 
	 public void practice9() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 1 :");
		 int num1 =sc.nextInt();
		 
		 System.out.print("정수2:");
		 int num2 = sc.nextInt();
		 
		 System.out.print("입력:");
		 int input =sc.nextInt();
		 
		 System.out.println((input <= num1 || input >num2));
		 
		 
	 }
	 
	 public void practice10() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("입력1:");
		 int num1 =sc.nextInt();
		 System.out.print("입력2 :");
		 int num2 =sc.nextInt();
		 System.out.print("입력3 :");
		 int num3 =sc.nextInt();
		 
		 System.out.println(num1 == num2 && num2 == num3 ? "true" :"false");
		 
	 }
	 
	 
	 public void practice11() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("A사원의 연봉:");
		 int a = sc.nextInt();
		 System.out.print("B사원의 연봉:");
		 int b = sc.nextInt();
		 System.out.print("C사원의 연봉 :");
		 int c = sc.nextInt(); 
		 
		 double alncen = a * 1.4;
		 double blncen = b * 1.0;
		 double clncen = c * 1.15;
		 System.out.println();
		 
		 System.out.println("A사원의 인센티브포함 연봉 :" +alncen);
		 System.out.println(alncen >= 3000? "3000이상" : "3000미만");
		 
		 System.out.println("B사원의 인센티브포함 연봉 :" + blncen);
		 System.out.println(blncen >= 3000?  "3000이상" :"3000미만");

		 
		 System.out.println("c사원의 인센티브포함 연봉 :" + clncen );
		 System.out.println(clncen >= 3000? "3000이상" :"3000이상");
		 
	 }
	
}
