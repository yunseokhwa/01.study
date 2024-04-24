package com.kr.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kr.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {
public static void main(String[] args) {
		
		ArrayList<Phone> list = new ArrayList<>();// jdk 6버전 이상 
		System.out.println(list);//[]
		
		
		list.add(new Phone());
		list.add(new Phone("아이폰 ","애플 ",130000,"15pro"));
		list.add(new Phone("갤러시", "삼성 ",120000, "s23"));

		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(100000);
		list.get(0).setSeries("1");
		
		
		/*
		 * int total = 0;
		for(int i=0; i<list.size(); i++) {
			total += list.get(i).getPrice();
			System.out.println(list.get(i).information());
		}
		*/
		
		
	
         // 향상된 for문 
		
		int total = 0;
		for(Phone p : list) {// p=list.get(0) => p= list.get(1)
			total += p.getPrice();
			System.out.println(p.iformation());
		}
		
		
		
		
		
		
		
		System.out.println("총가격 :"+ total +"원");
		System.out.println("평균가격:"+ total/list.size()+"원");
		
		
		// 사용자가 구매하고자 하는 핸드폰명을 입력받아 
		// 해당 휴대폰을 찾은 후에 그 가격을 알려주도록
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 입력 :");
		String buy = sc.nextLine();
		
		for(Phone p : list) { // p= list.get(0) => p=list.get(1) => ...
			if(p.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 "+p.getPrice()+"원입니다.");
			}
			
		}
	}
}
		
		
		
		

