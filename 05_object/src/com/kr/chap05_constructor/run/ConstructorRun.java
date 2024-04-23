package com.kr.chap05_constructor.run;

import com.kr.chap05_constructor.model.vo.User;

public class ConstructorRun {


	  public static void main(String[] args) {
	      
	      // 1. 기본생성자로 객체 생성
	      User u1 = new User();
	      System.out.println(u1.information());
	      
	      // 각 필드에 JVM의 초기값들이 담겨 있음 !! 
	      
	      // 회원가입 필수 입력사항만 입력 받는다면?
	      /*
	      User u2 = new User();
	      u2.setUserId("user02");
	      u2.setuserPwd("pwd02");
	      u2.setuserName("차은우");
	      
	      */
	      
	      // User u2 = new User(); // 모든 값이 초기값에 담긴 상태
	      // 2. 매개변수 3개짜리 생성자로 객체 생성
	      User u2 = new User("user02", "pwd02", "차은우");
	      System.out.println(u2.information());
	        
	      //setter를 안만들어도 되지 않을까? -> 아님
	      u2.setuserName("차으누");//개명
	      User u3 = new User("user03", "pwd03", "장원영", 20, 'F');
	     System.out.println(u3.information());
	     
	     // getter는??
	     //아이디 찾기 => 아이디만 !! 보여줘야 함!!
	    System.out.println(u2.getuserId());
	     
	     
	     }

	  } 
	      
	
	


