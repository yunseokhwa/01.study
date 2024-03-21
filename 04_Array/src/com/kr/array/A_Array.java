package com.kr.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수있는 개념
	 * => "같은 자료형의 값 "으로만 담을 수 있음
	 * => 정확히 애기하자면 배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작!)
	 */
	
	public void method1() {
		//*배열을 왜 쓰는지 
		//변수라는 것만을 이용하게 되면 => 대량의 데이터들을 보관하고자 할때 각각의 변수를 만들어서 따로 관리
		// int num1 = 0,1,2,3,4;
		/*
		 * int num1 =0;
		 * int num2 =1;
		 * int num3 =2;
		 * int num4 =3;
		 * int num5 =4;
		 */
		// 출력하과자 할때도 => 일일히 출력해야됨(반복문 활용불가)
		
		/*
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		for(int i=1; i<5; i++) {
			System.out.println(num i);
		}이거안된다 .
		
		//총합계를 구할때도 => 일일 히 더해줘야 됨 (반복문 불가)
		int sum = num1 +num2 +num3 +num4 +num5;
		*/
		
		/*
		 * 1.배열 선언 (여러개의 값을 보관할 배열 을 만들겠다)
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형 [] 배열명;=>저는 이걸로 간다
		 * 
		 */
		//int a; //변수 선언
		//int arr[];
		//int[]arr;//오로지 int 값만 담을수있다
		/*
		 * 2.배열할당=>크기지정 (이 배열에 몇개의 값들을 보관할껀지 크기를 지정하는 과정 ,그 개수만큼 방이 만들어진다)
		 * 배열명 = new 자료형[배열크기]
		 * 
		 */
		//arr = new int [5];
		//**배열 선언과 동시에 할당(배열 만듦과 동시에 크기 지정)
		int[]arr = new int[5];
		/*
		 * 3.값 대입
		 *  배열명[인덱스]= 값;
		 * 
		 */
		//이거 반복문으로 써보는거 아닐까
		/*
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		*/
		//1.배열 장점: 반복문 활용가능!!
		for(int i=0; i<4; i++) {
			arr[i]=i;
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
        System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
	    for(int i=0; i<4; i++) {
	    	System.out.println(arr[i]);
	    }
	    System.out.println(arr);//실제 arr 이라는 박스에는 "주소값" 이라는게 담겨있음
	}
	
	public void method2() {
		int i = 10;
		//배열 선언과 동시에 할당
		int[] iArr = new int[5];
		System.out.println(iArr);
		
		double[]dArr = new double[3];
		System.out.println(dArr);
		/*
		 * 실제 값(리터럴) 을 곧바로 담을 수있는 변수를 일반 변수라고 얘기하고,
		 * 주소값을 담고 있는 변수는 참조 변수(레퍼런스 변수)라고한다
		 * 
		 * 기본자료형(boolean ,char,byte,short,int
		 * 
		 */
		
	}
	public void method3() {
		int[] iArr = new int [3]; //0번 1번 인덱스
		double[] dArr = new double [4];//0번 ~3번 인덱스
		//배열 선언 하고 크기지정(할당) 까지만 한 상태
		//그럼 각각의 인덱스에 초기화 가 돼있을까?
		
		//각각의 인덱에 값을 안담고 출력해보기
		//iArr 배열 출력
		for(int i=0; i<3; i++) {
		    System.out.println(dArr[i]);
		}
		//내가 각 인덱스에 초기화 (값대입)를 하지 않아도 값들이 담겨있음!!왜일까?
		//heap이라는 공간에 절대 빈공간이 존재할수없음!
		//따라서 공간이 만들어질때 JVM이기본적으로 초기화 진행해줌
		
	}
	
	public void method4() {
		int [] arr = new int [5];
		/*
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		*/
		//값 대입
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		//값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr);//배열의 자료형 + @+주소값 의 16진수 형태
		System.out.println(arr.hashCode());//주소 값의 10진수 형태
		System.out.println("배열의 길이 :" +arr.length);//배열의 길이
		
	}
	public void method5() {
		//int result;//초기화
		//system.out.println(result);
		//배열을 쓰면서 볼 수있는 오류를 모음 
		//int [] arr; //크기 지정 까먹은 경우
		int[]arr=null;//아무것도 참조하고 있지 않음
		// 주소값을 담는 변수의기본값은 null임
		
		System.out.println(arr);//아무것도 참조하고 있지 않음
		//주소값을 담는 변수의 기본값은 null임
		
		System.out.println(arr);// 초기화가 안돼있어서 오류남!!
		
		//null  가지고 메소드를 호출한다거나=> null.hashcode,null.length 특정어딘가에 접근하고자 한다면 오류 발생
		//항상 오류 발생 !! => NullPointerException
		//system.out.println(arr.hashCode());
		//System.out.println(arr.lenght);
		System.out.println(arr[0]);
		
		
		
	}
	public void method6() {
		int[]arr=new int[5];
		/*
		 * arr[0]=2;
		 * arr[1]=4;
		 * arr[2]=6;
		 * arr[3]=8;
		 * arr[4]=10;
		 */
		/*
		 * for(int i=0; i<arr.lenght; i++){
		 * arr[i] =2*(i+1);
		 */
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i]= value;
			value += 2;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("arr의 해쉬코드값 :" +arr.hashCode());
		System.out.println("arr의 길이 :" +arr.length);
		//ArrayIndexOutBoindsException:배열에 부적절한 인덱스 제시시 발생(범위에서 벗어난 인덱스 제시)
		//* 배열의 가장 큰 단점
		//한번지정된 배열의 크기는 변경이 불가 
		//=> 배열의 크기를 변경하고자 한다면 다시 만들어야됨
		
		arr = new int[7];
		
		System.out.println("변경후의arr의 해쉬코드값" +arr.hashCode());
		System.out.println("변경후의 arr의 길이 :" + arr.length);
		//주소값이 변경됨 !! => 새로운 곳을 참조하고 있음!!
		/*
		 * 연결이 끊어진 기존 배열 Heap영역에 둥둥 떠다님 ..(어디에도 참조되어 있지 않으므로 필요없는 존재임 == 지우는게 좋음)
		 * => 일정시간이 지나면 "가비지컬렉션(GC)"가 알아서 지워줌!!
		 * 
		 * => 자바에서의 "자동메모리 관리"특징 == 개발자가 코드작성에만 신경 쓸수 있음
		 */
		
		//배열을 강제로 삭제시키고자 한다면 ?? == > 연결고리를 끊으면됨
		
		arr = null; //아무것도 참조하지 않겠다 !!
		
		System.out.println(arr);// null
		// null.xxx()=>에러 ?널포인터
		
		  
	}
	
	public void method7() {
		//배열 선언 , 할당,초기화 다 동시에 하기 
		//표현법 1
		int[] arr1= new int[] {1,2,3,4};
		
		//표현법 2
		int[] arr2 = {1,2,3,4}; 
		
		System.out.println(arr1 == arr2);//false
		//각각의 변수에 담겨있는 주소 값을 비교하기 때문
	}
	
	public void method8() {
		// 1.크기 10짜리 배열 생성 후
		
		int []arr = new int [10];
		
		//2.반복문 활요해서 0번 인덱스~ 마지막 인덱스 까지 순차적으로 접근하면서 값을 대입
		// 매번 1~100 사이의 발생되는 램덤값
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*100)+1);
		}
		//3.반복문 활용해서 해당 배열 의 0번 인덱스 ~ 마지막 인덱스 까지 있는 값 출력
		// arr[X] :xx
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] :"+ arr[i]);
		}
	}
	
	public void method9() {
		//1사용자에게 배열의 길이를 입력받은 후
		// 해당 그 크기 만큼의 문자열 배열 생성
		 Scanner sc =new Scanner(System.in);
		 System.out.print("배열의 길이 입력:");
		 int size =sc.nextInt();
		 
		 sc.nextLine();
		 
		 String []arr =new String[size];
		 //2.반복문 활용해서 매번 사용자에게 과일명 입력받아
		 // 그값을 매 인덱스 자리에 대입 (0번 ~ 마지막인덱스)
		 for(int i=0; i<arr.length; i++) {
			 System.out.println("aee["+i+"]:"+arr[i]);
		 }
	}
	public void method10() {
		//사용자에게 문자열 하나 입력 받은후 =>"apple"
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :");
		String str = sc.nextLine();//kiwi
		System.out.print("찾고자 하는문자:");
		char ch = sc.nextLine().charAt(0);
		
		char[]arr =new char[str.length()];
		
		/*
		arr[0] =str.charAt(0);
		arr[1] =str.charAt(1);
		arr[2] =str.charAt(2);
		arr[3] =str.charAt(3);
		*/
		for(int i=0; i<arr.length; i++) {
			arr[i]= str.charAt(i);
		}
		//반복문 활용해서 해당 배열의 0번 마지막 인덱스까지 담긴 값 출력
		// 찾고자 하는 문자가 존재할 경우 몇개 존재 하는지 알려주자 
		int count =0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:" +arr[i]);
			
			if(ch == arr[i]) {//순차탐색
				count++;
			}
		}
		
		System.out.println("찾아진 문자 개수 :" +count);
		
	}
	
	public void method11() {
		// 1.사용자에게 배열의 길이를 입력 받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 :");
		int size = sc.nextInt();
		
		//2. 그 크기 만큼의 정수 배열 생성
		int[] arr = new int[size];
		
		//3. 반복문을 활용해서 0번 ~ 마지막 인덱스까지 매번 1~100 사이으 램덤값 발생시켜서 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*100)+1);
		}
		//4.반복문을 활용해서 0 번 ~마지막인덱스까지 매번 1~100 사이의 램덤값을 발생시켜서 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*100)+1);
		}
		//4.반복문을 활용해서 0번 ~ 마지막인덱스까지 담긴 값을 출력과 동시에 
		//   해당 그 인덱스에 담긴 값이 짝수인 값들의 총합을 구하자 =>누적합
		
		// 1.sum 변수 만들기 
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" +i +"]" + arr[i]);
			//2.반복문 돌려가며 누적합 공식 사용하기 => sum += i
			if(arr[i] % 2== 0) {
				sum += arr[i];
			}
		}
		System.out.println("해당 배열의 짝수의 총합 :" +sum);
		
		//arr[x] : xx
		//해당 배열의 짝수의 총합  : xxx
		
		
	}
	
	public void method12() {
		// 변수만을 가지고 프러그래밍을 했을경우
		// 생일자 5명 의 나이를 보관한다. => 변수 
		
		int age1 =15;
		int age2 =23;
		int age3 =50;
		int age4 =34;
		int age5 =25;
		//반복문 사용 사용불가 
	/*	
	for(int i=1; i<=5; i++) {
		System.out.println(age); // agei 라는 변수명을 찾고있어서 안됨 
		System.out.println(age +i);//age라는 변수명을 찾고있어서 안됨
	}
	*/
		
	//배열가지고 프로그래밍	
		int [] ages = new int [5];
		ages[0]=15;
		ages[1]=23;
		ages[2]=50;
		ages[3]=34;
		ages[4]=25;
		
		//1. sum 변수 만들기 
		int sum =0;
		//누적합 공식 활용해서 반복문 돌리기 =>sum += i;
		for(int i=0; i<ages.length;i++) {
			sum += ages[i];
		}
		for(int i=0; i<ages.length;i++) {
			System.out.println("ages["+i+"]:"+ages[i]);
		}
		System.out.println("나이의 총합 :" +sum);
		
	}

}
