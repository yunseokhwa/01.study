package com.kr.chap06_method.run;

import com.kr.chap06_method.controller.OverloadingTest;
import com.kr.chap06_method.controller.StaticMethod;

public class MethodRun {
	public static void main(String[] args) {
		/*
		 * // -------------------- NonStaticMethod -----------------
		 * 
		 * NonStaticMethod n = new NonStaticMethod();
		 * 
		 * // 1.매개변수가 없고 반환값도 없는 메소드 n.method1();
		 * 
		 * // 2.매개변수 없고 반환값은 있는 메소드 // String str = n.method2(); //
		 * System.out.println(str); System.out.println(n.method2());
		 * 
		 * // 3.매개 변수 있고 반환값은 없는 메소드 호출 // n.method3();->매개변수 없으면 오류남 //
		 * n.method3(10);-> 매개변수에 개수 맞지 않으면 오류남 // n.method3(20, 10); -> 반환값이 없어서 오류남
		 * n.method3(10, 0);
		 * 
		 * // 4.매개변수도 있고 반환값도 있는 메소드 호출 // char ch=n.method4("lemon",100); //
		 * System.out.println(ch); // 사용자에게 매게변수를 입력받아서 해당 메소드 호출 Scanner sc = new
		 * Scanner(System.in); System.out.println("문자열 입력 :"); String str =
		 * sc.nextLine();
		 * 
		 * System.out.print("인덱스 입력 :"); int index = sc.nextInt();
		 * 
		 * // 여기서 유효성 검사 해보기 // index가 0이상 이고 , 문자열의 길이보다 작을 때만 method4실행
		 * 
		 * if (index > 0 && index < str.length()) {
		 * System.out.println("결과:"+n.method4(str, index)); } else {
		 * System.out.println("인덱스 값이 부적절합니다."); }
		 */

		// ----------- Static Mathod ---------------------
		//Math.random();
		StaticMethod.method1();
		System.out.println(StaticMethod.method2()); // return은 값을 출력하지 않으면 안보임

		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("kiwi", "kiwi"));
		
		// -------------- OverloadingTest ----------------------------------
		  OverloadingTest ot = new OverloadingTest();
	      ot.test();
	      ot.test(10);
	      ot.test(10, "ㅋㅋㅋ");
	      ot.test("ㅋㅋ", 10);
	      ot.test(10, 20);
	      
	      // 오버로딩 대표적인 예 => print()
	      System.out.print(10);
	      System.out.print("ㅎㅎㅎ");
	      System.out.print(15.3);
	      
	}
}
