package com.kr.chap02.loop;

public class B_While {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 
	 * while(조건식){
	 *     반복적으로 실생할 코드 ;
	 *     [증감식;]
	 *     
	 *     }
	 *     조건식이 검사 --> true 일경우 실행 코드 실행
	 *     조건식이 검사 --> true 일경우 실행코드 실행 
	 *     조건식 검사 -->false일 경우 실행코드 실행 x => 반복문 빠져나감
	 * 
	 */
	
	public void method1() {
		//안녕하세요 5번 출력
		int i=1;
		
		while(i<=5) {
			System.out.println("안녕하세요");
		     i++;
		}
		
		//for문 과다른점 !! i값을 출력할수있다
		System.out.println(i);
	}
	
	public void method2() {
		//1 2 3 4 5
		int i=1;
		while(i<=5) {
			//system.out.print(i+"");
			//i++
			// 후위 연산자 로 표현해보기
		System.out.print(i++ + "");//위의 두줄을 다음과 같이 한줄로 줄일수 있음
		
			
		}
		
		
	}

	
	public void method3() {
		//1에서 부터 10 사이에 홀수안에 출력
		// 1 3  5 7 9 
		int i =1;
		/*
		while(i<=9) {
			System.out.print(i);
			i+2;
			*/
		while(i<9) {
			if(i%2 == 1)
				System.out.print(i+"");
		}
		i++;
		}
	
	public void method4() {
		//1부터 램덤값 (1~100)까지의 합계
		int random =(int)(Math.random()*100 +1);
		//1.sum 변수만들기
		int sum =0;
		//2 누적합 공식 이용해서 반복문 돌리기 =>sum += i;
		
		int i=1;
		while(i<random) {
			sum +=i;//누적공합식
			i++;
		}
		System.out.println("1부터 " +random +"까지의 합 :" +sum);
		
		
	}
	}

