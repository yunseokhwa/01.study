package com.kr.chap02_objectArray.run;

import com.kr.chap02_objectArray.model.vo.Phone;

public class WrongSample {
	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		// ---------------- 1번문제 조치내용 ------------
		 arr[0]= new Phone();
		 arr[1]= new Phone();
		 arr[2]= new Phone();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		
		 //잘못된 부분 
		//1. NullpointerException :객체 배열의 각 인덱스 에 담긴 값이 null 인 상태에서 메소드 를 호출하려고 했긴때문에 
		 // 초치내용  => 객체 배열을 만든 후 각인덱스 객체를 생성을 진행해야됨 .
		
		//2. ArrayIndexOutOfBoundException: 배열의 적절한 인덱스 범위 를 벗어낫기 떄문에 
		// 조건식으로 i <= 배열의 길이 라고 제시돼있음 .배열의 마지막 인덱스 보다 큰 값이 제시 

	}

}
