package com.kr.chap04_field.run;

public class FieldRun {
	
	public static void main(String[] args) {
		  // ---------- FieldTest1 -------------
	     
	    //FieldTest1 f1 = new FieldTest1();
	    //f1.test(5);
	    
	      
	      
	      // ---------- FieldTest2 -------------
	   // FieldTest2 f2 = new FieldTest2();
	      
	      //public 
	      //System.out.println(f2.pub);
	      
	      //protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
	     // System.out.println(f2.pro);
	      
	      //default : 오로지 같은 패키지 내에서만 접근 가능
	     // System.out.println(f2.def);
	      
	      //private : only 해당 클래스에서만 접근 가능!
	      //System.out.println(f2.pri);
	      
	      
	      // ---------- FieldTest3 -------------
	     // System.out.println(FieldTest3.sta);
	     // System.out.println(FieldTest2.sta);
	      
	      // 수정하고 싶다면?
	     // FieldTest3.sta = "ㅋㅋㅋ";
	     // System.out.println(FieldTest3.sta);
	      // 근데 절대 !! 변경 안되게 하고싶다면?? =>
		// FieldTest3.STA_FIN = "ㅎㅎㅎㅎ"; =>변경불가 
		      
		      System.out.println(Math.PI);
		      
	      
	      
	   }
	}