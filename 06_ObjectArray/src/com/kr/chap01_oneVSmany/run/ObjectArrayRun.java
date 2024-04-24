package com.kr.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kr.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	public static void main(String[] args) {
		//개체 배열 활용해서 해보기
		Scanner sc =new Scanner(System.in);
		Book[] books =new Book[3];
		//세개의 도서에 대한 정보를 반복적으로 입력 받아 각 인덱스에 객체 생성
		for(int i=0; i<3; i++) {
			   System.out.println( i+1 + "번째 도서정보 입력 : ");
		         System.out.print("도서명 : ");
		         String title = sc.nextLine();
		         
		         System.out.print("저자명 : ");
		         String author = sc.nextLine();
		         
		         System.out.print("가격 : ");
		         int price = sc.nextInt();
		         
		         sc.nextLine();
		         
		         System.out.print("출판사 : ");
		         String publisher = sc.nextLine();
		         /*
		         books[0]=new Book(title, author, price, publisher);
		         books[1]=new Book(title, author, price, publisher);
		         books[2]=new Book(title, author, price, publisher);
			*/
		         
		         // 각각의 인덱스에 차곡차곡 객체 생성 
		         books[i]=new Book(title, author, price, publisher);
		         
		}
		
		        /*
	               System.out.println(books[0].information());
	               System.out.println(books[1].information());
	               System.out.println(books[2].information());
		         */
		   for(int i=0; i<3; i++) {
			   System.out.println(books[i].information());
		   }
		   
		   //도서 제목으로 검색하는 서비스 
		   System.out.println("검색할 책제목 :");
		   String Search =sc.nextLine();
		   
		   
		   
		   for(int i=0; i<books.length; i++) {
			   if(books[i].getTitel().equals(Search)) {
				   System.out.println(books[i].information());
			   }
		   }
		
		
	}

}
