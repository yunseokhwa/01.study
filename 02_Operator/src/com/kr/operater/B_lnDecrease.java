package com.kr.operater;

public class B_lnDecrease {
	
	/*
	 * *증감 연산자 (단항 연산자 )
	 * 
	 * ++ 변수에 담긴 값을 1 증가시켜주는 연산자 
	 *     ++ 변수 , 변수 ++
	 *     
	 *    
	 * -- : 변수에 담긴 값을  1  감소 시켜주는 연산자 
	 *   --변수 , 변수  --
	 *   (증감연산자 ) 변수 : 전위 연산자 => "선증감 "후처리
	 *   변수 (증감연산자 ) : 후위 연산자 => 선처리 " 후증감"    
	 * 
	 */
	
	
	public void method1 () {
	
		// 전위 연산 테스트 
		int num1 = 10;
		System.out.println("전위 연산 적용전 num1의 값 :" + num1);
		System.out.println("1회 수행후 결과 " + ++num1);// num1 = 11출력
		System.out.println("2회 수행후 결과 " + ++num1);// num1 = 12출력
		System.out.println("3회 수행후 결과 " +  ++num1);// num1 = 13 출력
		
		System.out.println("================================");
		
		//후위연산 테스트 
		int num2 = 10;
		System.out.println("후위연산 적용전에 num2 의 값 " + num2);// num2 =10
		System.out.println("1회 수행후 결과 " + num2++);//10출력후 => num2 = 11로 증가 
		System.out.println("2회 수행후 결과 " + num2++);// 11출력후 => num2 = 12 로 증가 
		System.out.println("3회 수행후 결과 " + num2++);// 12출력후 => num2 = 13으로 증가 
		System.out.println("최종 num2 의 값 :" + num2);
		
	}
	
	
	public void method2() {
		int a =10;
		int b =++a;// a=10,b=11
		System.out.printf("a: %d, b: %d" , a , b );
		
		
		int c = 10;
		int d = c++; // c=11, d=10
		
		System.out.printf("c:%d, d :%d\n" , c , d);
		
		System.out.println("=============");
		
		int num = 20;
		System.out.println("현재 num :" + num ); // num=20
		System.out.println("++num은?:" + ++num);// num = 21
		System.out.println("num++은? :" + num++);// num = 21(22)
		System.out.println("--num은? :" + --num);// num = 21
		System.out.println("num--는? :" + num--); // num = 21
		System.out.println("최종num은?:" + num);// num = 21(20)
	}
	
	
	
	public void method3() {
		int num1 = 20;
		int result = ++ num1 *3;// num=21 , result = 63
		System.out.printf("num1: %d, result : resilt : %d\n" , num1 , result);
		
		
		int num2=20;
		int result2 = num2 ++*3;// num2 = 21 , result2=60
		System.out.printf("num2: %d result2 : %d\n" , num2, result2);
	}
	
	
	public void method4() {
		 
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //a=10(11)
		System.out.println((++a) + (b++));// a=12, b=20(21) => 32출력
	    System.out.println((a++) + (--b)+(--c));// a=12(13) , b=20, c=29 => 61출력
	    
	    System.out.printf("a: %d , b : %d ,c :%d",a,b,c);
	}

	
	public void quiz1() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a = 6 , b=10, c=16
		int d = c / a; //a=6, b=10, c=16, d=2 
		int e = c % a;  //a=6 , b=10, c=16 , d=2 , e=4
		
		
		int f = e++; //a=6 , b= 10, c=16 , d=2(1), e=5 , f=4 , g=11
		
		int g = (--b) + (d--);//a=6 , b=9 , c=16, d=2(1), e=5 , f=4 , g=11
		
		int h = 2; //a=6, b=9, c=16 ,d=1 , e=5, f=4, g=11 , h=2
		
		
		// a=6(7) , b=9, c=15 , d=1 , e=6 , f=4 , g=11(10), h=2
		int i = (a++) +b /(--c /f) * (g-- - d) % (++e + h);
		// 6+9/(15/4) *(11-1)%(6+2)
		// 6+9/3 * 10 % 8
		// 6 + 9 / 3 * 10 % 8
		// 6 + 3 * 10 %
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e :" + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
	}
}
