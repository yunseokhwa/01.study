package com.kr.operater;

public class F_Compound {
	
	
	/*
	 * * 복합 대입 연산자 
	 * 산술 연산자와 대입 연산자가 결합돼 있는 형태 (산술연산 먼저 쓰고 대입연산 나중)
	 * 연산처리 속도가 빨라지므로 사용하는걸 권장함 !!
	 * 
	 * 
	 *   += -= *= /= %=
	 *   
	 *   a = a + 3; => a +=3;
	 *   a = a - 3; => a -=3;
	 *   a = a * 3; => a *=3;
	 *   a = a / 3; => a/ =3;
	 *   
	 *   a =a% 3;   =>a%=3;
	 * 
	 */

	public void method1() {
		int num =12;
		 System.out.println("최초 num :" + num);//12
		 
		 num = num +3;
		 System.out.println("3증가 시킨 num :" + num);//18
		 
		 num-= 5;
		 System.out.println("감소 시킨  num:" + num );//13
		 num*=6;
		 System.out.println("6배 증가 시킨 num :" + num);//78
		 
		 num/=2;
		 System.out.println("2배를 감소시킨 num :" + num);//39
		 
		 num%=4;
		 System.out.println("최종 num :" + num);//3
		 
		 String str ="Hello";
		 
		 str += "World";
		 
		 System.out.println(str);
		 
	     
	}
	
}
