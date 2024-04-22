package com.kr.chap03_class.run;

import com.kr.chap03_class.model.vo.Product;

public class ClassRun {
	   public static void main(String[] args) {
		      
		   Product a = new Product();
		   
		   System.out.println("=== 상품1 ===");
		   
		   a.setpName("초코송이");
		   a.setPrice(1500);
		   a.setBrand("롯데");
		   
		   System.out.println("상품명 : "+ a.getpName());
		   System.out.println("가격 : " + a.getPrice()+"원");
		   System.out.println("브랜드 : " + a.getBrand());
		   
		   System.out.println("=== 상품2 ===");
		   
		   a.setpName("초코파이");
		   a.setPrice(5000);
		   a.setBrand("오리온");
		   
		   System.out.println("상품명 : "+ a.getpName());
		   System.out.println("가격 : " + a.getPrice()+"원");
		   System.out.println("브랜드 : " + a.getBrand());
		   
		   System.out.println("=== 상품3 ===");
		   
		   a.setpName("빈츠");
		   a.setPrice(2000);
		   a.setBrand("롯데");
		   
		   System.out.println("상품명 : "+ a.getpName());
		   System.out.println("가격 : " + a.getPrice()+"원");
		   System.out.println("브랜드 : " + a.getBrand());
		   
		   
		   
		   
		   /*
		      Person p = new Person();
		      
		      System.out.println(p.getId());
		      System.out.println(p.getAge());
		      System.out.println(p.getGender());
		      */
		      // 생성 후에 필드에 담긴값을 곧바로 알아보면
		      // JVM이 초기화(값 세팅)까지 진행해줬음!!
		      
		      /*
		      p.setId("user01");
		      p.setPwd("pwd01");
		      p.setName("이혜민");
		      p.setAge(20);
		      p.setGender('F');
		      p.setPhone("010-1234-5678");
		      p.setEmail("hyemin@gamil.com");
		      
		      System.out.println(" === 값 대입 후 ===");
		      System.out.println(p.getId());
		      System.out.println(p.getPwd());
		      System.out.println(p.getName());
		      System.out.println(p.getAge());
		      System.out.println(p.getGender());
		      System.out.println(p.getPhone());
		      System.out.println(p.getEmail());
		      */
		   
		      // 첫번째 방법 : 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화 하는 방법
		      //Product p1 = new Product();
		      //p1.setpName("갤럭시");
		      //p1.setPrice(1200000);
		      //p1.setBrnad("삼성");
		      
		      // 두번째 방법 : 매개변수 생성자로 생성
		      Product p1 = new Product("갤럭시",1200000,"삼성");
		      
		      // pName : xxx. price : xxx , brand : xxx
		      //System.out.println("pName : " + p1.getpName() + " ,price :" +  p1.getPrice() + ", brand  : " + p1.getBrand() );
		      
		      
		       System.out.println(p1.information());
		      
		      Product p2 = new Product();
		            
		      
		      }
		   
		}
