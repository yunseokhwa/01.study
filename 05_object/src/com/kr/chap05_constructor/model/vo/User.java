package com.kr.chap05_constructor.model.vo;

public class User {
	
	 private String userId;
	   private String userPwd;
	   private String userName;
	   private int age;
	   private char gender;
	   
	   
	   /*
	    * *생성자 
	    *   * public 클래스명([매개변수, 매개변수 , .....]){
  * 
  * 
  * 
  * }
  * 
  * 이거 왜 써야할까 ? 
  * * 생성자를 작성하는 목적
  * 
  * 1. 객체를 생성해주기 위한 목적
  * 
  * * 생성자 작성시 주의 사항
  * 1.반드시 생성자명은 클래스명과 동일해야됨 (대/소문자 구분)=>안그럼 오류남 
  * 2.반환형이 존재하지 않음.(만이 반환형을쓰게 되면 메소드로 인식해버림 )
  * 
  * 
  * 
  */
	   
	   public User() {
		   //기본생성자 (매개변수가 없는 생성자 ) 
		   // 단지 객체 생성만을 목적으로 할때 사용 
		   //System.out.println("하이");
		   // 기본생성자를 생략 했을 경우  => "Jvw" 이 자동으로 만들어줬기 때문에 
		   //객체 생성과 동시에 전달값을 매개 변수로 받아서 해당 

			 
		 }
	  
	   // 매개변수 생성자
	   // 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적 
	   
	   public User(String userId, String userPwd, String userName) {
	      this.userId = userId;
	      this.userPwd = userPwd;
	      this.userName = userName;
	      
	   } 
	   
	   public User(String userId, String userPwd, String userName, int age, char gender) {
	      /*
	      this.userId = userId;
	      this.userPwd = userPwd;
	      this.userName = userName;
	   */
	      this(userId,userPwd,userName); // this 생성자 => 이렇게 하면 코드를 더 간결하게 쓸 수 있음

	      /*
	       * 위와 같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 존재할 경우
	       * this() 생성자 활용 가능
	       * => 같은 클래스 내에 생성자에서 또 다른 생성자 호출하고자 할 때 사용함.
	       * ** 유의사항 : 반드시 첫 줄에 작성해야 됨!! 위치가 맨 위여야 함!!
	       */
	      
	      this.age = age;
	      this.gender = gender;

	   
 
	   }
	   
	   
	      public void setUserId(String userid) {
	         this.userId = userId;
	   }
	      
	      public void setuserPwd(String userPwd) {
	         this.userPwd = userPwd;
	      }
	      
	      public void setuserName(String userName) {
	         this.userName = userName;
	         
	      }
	      
	      public void setage(int age) {
	         this.age = age;
	      }
	      
	      public void setgender (char gender) {
	         this.gender = gender;
	      }
	      
	      public String getuserId() {
	         return userId;
	      }
	      
	      public String getuserPwd() {
	         return userPwd;
	      }
	      
	      public String getuserName() {
	         return userName;
	      }
	      
	      public int getage() {
	         return age;
	      }
	      
	      public char gender() {
	         return gender;
	      }
	         
	      public String information() {
	         return "userId : " + userId + ", userPwd: " + userPwd + ", userName : " + userName + ",age : " + age + ",gender : " + gender;
	      }

	
	
	

}
	


	