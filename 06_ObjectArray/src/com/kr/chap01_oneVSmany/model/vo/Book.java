package com.kr.chap01_oneVSmany.model.vo;

public class Book {

	//도서명 , 저자 , 가격 ,출판사 
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	
	//기본생성자 
	public Book() {};
	//매개변수 생성자 (전체)
	public Book(String title, String author,int price,String publisher) {
		
		  
		   {
			   
			      this.title = title;
			      this.author = author;
			      this.price = price;
			      this.publisher = publisher;
		      
		   }

		
	}

	
	// 각 필드에 대한 getter - setter
	//information 함수 
	
	public void  settitle(String title) {
		this.title=title;
	}
	public void setauthor(String auther) {
		this.author=auther;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public String getTitel() {
		return title;
	}
	
	
	public String getAuther() {
		return author;
		
	}
	public int getPrice() {
		return price;
		
		
	}
	
	public String getpublisher() {
		return publisher;
	}
	
	   // information 함수

	   public String information() {
	      return "tiTle : " + title   + " author :  " + author +"  price : " + price  + "  publisher : " + publisher ; 
	      
	   }

	
	
}