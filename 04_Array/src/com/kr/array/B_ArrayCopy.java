package com.kr.array;

import java.util.Arrays;
//import java .lang*;
public class B_ArrayCopy {
	//배열복사
	public void method1() {
		int[]origin= {1,2,3,4,5};
		
		System.out.println("===원본 배열 출력===");
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i]+"");
	
	}
		   // 단순하게 origin을 다시 대입시킨 copy배열 셋팅
	      
	      int[] copy = origin;
	      System.out.println("=== 복사본 배열 출력 ===");
	      for(int i=0; i<copy.length; i++) {
	         System.out.print(copy[i] + " ");
	      }
	      
	      System.out.println();
	      
	      copy[2] = 99;
	      
	      System.out.println("-------복사본 배열 값 변경 후------- ");
	      
	      System.out.println("=== 원본 배열 출력 ===");
	      for(int i = 0; i<origin.length;i++) {
	         System.out.print(origin[i]+ " ");
	      }
	      
	      System.out.println();
	      
	      
	      // 단순하게 origin을 다시 대입시킨 copy배열 셋팅
	      
	      
	      System.out.println("=== 복사본 배열 출력 ===");
	      for(int i=0; i<copy.length; i++) {
	         System.out.print(copy[i] + " ");
	      }
	      
	      System.out.println();
	      //copy 만을 가지고 수정을 해도 원본까지 변경되어 있음
	      //왜? origin 과copy가 같은 곳을 참조하고 있기 때문 ( 즉, 같은 주소값)
	     System.out.println("origin 주소값 : "+origin.hashCode() );
	     System.out.println("copy 의 주소값 :"+ copy.hashCode());
	     
	     //얇은 복사 : 주소값을 복사
	     
	      
	   }
	
	     //얇은 복사의 문제를 해결하기 위해서 깊은 복사 
        public void method2() {
        	//1.for문을 활용한 방법
        	//새로운 배열을 아싸리 생성한후 반복을 활용해서 
        	//원본배열의 값들을 새로이 만든 배열에 대입하는 방법
        	int[]origin = {1,2,3,4,5};
        	
        	//int[] copy = origein;// 얇은 복사 :주소값 대입
        	int[]copy =new int[5];//새로운 주소값
        	/*
        	copy [0]= origin[0];
        	copy [1]= origin[1];
        	copy [2]= origin[2];
        	copy [3]= origin[3];
        	copy [4]= origin[4];
        	*/
        	for(int i=0; i<copy.length; i++) {
        		copy[i]=origin[i];
        		
        	}
        	//copy 배열 수정해보기
        	copy[2]=99;
        	
        	
        	   System.out.println("-------복사본 배열 값 변경 후------- ");
     	      
     	      System.out.println("=== 원본 배열 출력 ===");
     	      for(int i = 0; i<origin.length;i++) {
     	         System.out.print(origin[i]+ " ");
     	      }
     	      
     	      System.out.println();
     	      
     	      
     	      // 단순하게 origin을 다시 대입시킨 copy배열 셋팅
     	      
     	      
     	      System.out.println("=== 복사본 배열 출력 ===");
     	      for(int i=0; i<copy.length; i++) {
     	         System.out.print(copy[i] + " ");
     	      }
     	      
     	      System.out.println();
     	      //copy 만을 가지고 수정을 해도 원본까지 변경되어 있음
     	      //왜? origin 과copy가 같은 곳을 참조하고 있기 때문 ( 즉, 같은 주소값)
     	     System.out.println("origin 주소값 : "+origin.hashCode() );
     	     System.out.println("copy 의 주소값 :"+ copy.hashCode());
     	     
     	     //얇은 복사 : 주소값을 복사
     	     
     	      
     	   }
        public void method3() {
        	//2.아싸리 새로운배열 생성후 System 이라는 클래스에서 arratcopy() 메소드를 이용한 복사 
        int[] origin = {1,2,3,4,5};
        int[] copy = new int[10]; //넉넉 하게 크게 생성 /0번~9번 인덱스까지 0이 다 담겨있을 것!!
        
        // System.arraycopy(원본배열명, 복사시작할인덱스,복사본배열명,복사본 배열의 복사될 시작인덱스, 복사할개수 );
         //System.arraycopy(origin,0,copy,0,5);
         //System.arraycopy(origin,0,copy,2,5);
        System.arraycopy(origin,1,copy,3,3);
        
         for(int i=0; i<copy.length; i++) {
        	 System.out.print(copy[i]+" ");
         }
        	
        	System.out.println();
        	System.out.println("origin주소값:"+origin.hashCode());
        	System.out.println("copy 주소값:"+ copy.hashCode());
        	//주소값이 다름 (깊은 복사 )
        	// => 각자 다른 배열 참조하고있음 
        	//=>즉 ,배열 수정시 서로에게 영향을 주지않음
        	
        	
        }
        public void method4() {
        	
        	//3.Arrays 클래스 제공하는 copyOf() 메소드  사용
        	int[] origin = { 1,2,3,4,5};
        	//복사본 배열 = Arrays.coppyOf(원본 배열명,복사할 길이 );
        	int[]copy = Arrays.copyOf(origin,10);
        	
        	String str =" ";
        	
        	/*[참고]
        	 * java.lang.Math
        	 * jave.lang.String
        	 * java.lang.System
        	 * => java.lang 패기지에 있는 클래스들은 쓸때 는 import안해됨!!
        	 * 
        	 * java.util.Scanner
        	 * java.util.Arrays
        	 * =>java.lang 이외의 패기지에 있는 클래스 들을 쓸때무조건 
        	 * 
        	 * 
        	 */
        	
        	
        	/*Arrays.copyOf메소드
        	 * =>내가 제시한 길이만큼 복사본 배열 크기 할당
        	 * => 내가 제사한 길이가 원본 배열의 크기보다 클 경우 기존의 배열에 있는 값은 다 복사 , 나머지는 0으로 채운다.
        	 * => 내가 제시한 길이가 원본배열의 크기보다 작을경우 기존의 배열에 있는 값을 내가제시한 길이만큼 본다.
        	 * 
        	 * 
        	 * 
        	 */
        	
        	
        	
        	for(int i=0; i<copy.length;i++) {
        		System.out.print(copy[i]+" ");
        	}
        	
        }
        	public void method5() {
        		//.clone()메소드 이용한 복사
        		// 인덱스 지정 불가, 크기 지정 별도로 못함
        		
        		
        		
        		int[] origin = {1,2,3,4,5};
        		// 복사본 배열 = 원본 배열.clone();
        		int[]copy =origin.clone();
        		
        		for(int i=0; i<copy.length; i++) {
        			System.out.print(copy[i]+" ");
        			
        			
        		}
        		System.out.println();
            	System.out.println("origin주소값:"+origin.hashCode());
            	System.out.println("copy 주소값:"+ copy.hashCode());
        		
        	}
        	
        	
        }
        
        
        
	
	  
	