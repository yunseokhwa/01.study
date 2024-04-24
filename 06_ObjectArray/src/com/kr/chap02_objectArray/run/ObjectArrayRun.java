package com.kr.chap02_objectArray.run;

import java.util.Scanner;

import com.kr.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {
public static void main(String[]args) {
		
		int[] arr = new int[3];
		
		
		arr[0]=10;
		arr[1]=10;
		arr[2]=20;
		
		
		// for loop문 => 가장기본적인 단순한 for문 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	
		Phone[] phones = new Phone[3];
		
		phones[0]= new Phone();
		phones[1]= new Phone("아이폰 ", "애플",1300000 , "15pro");
		phones[2]=new Phone("갤러시","삼성",1200000,"s23");
		
		
		phones[0].setName("벨벳폰");
	    phones[0].setBrand("엘지");
	    phones[0].setPrice(1000000);
	    phones[0].setSeries("1");
	    
	    // 총 휴대폰 가격 합!!
	    
	    int total=0;
	    for(int i=0; i<phones.length; i++) {
	    	total += phones[i].getPrice();
	    	System.out.println(phones[i].iformation());
	    }
		
		System.out.println("총가격 :"+total);
		System.out.println("평균가격 :"+ total/ phones.length);
		
		//사용자에게 구매 하고자 하는 핸드폰명을 찾아서 입력받아 
		//해당 휴대폰을 찾은 후에 그 가격을 알려주도록 
		// 당신이 구매하고자 하는 xxx폰의 가격은 xxx원 입니다 .
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("구매하고자 하는 핸드폰명:");
		String buy =sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.printf("당신이 구매하고자 하는 % 의 가격은 , %d원 입니다 .",phones[i].getName(),phones[i].getPrice());
			}
		}
		 
		
		
	}

}
