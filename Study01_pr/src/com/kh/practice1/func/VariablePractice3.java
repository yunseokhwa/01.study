package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 { //Variablepractice3
	
	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		
		
		double width = sc.nextDouble();
		//13.5
		
		System.out.print("세로 :");
	    double heigth =sc.nextDouble();
	    // 41.7
	    
	    
	    System.out.println("면적 :" +(width + heigth));
	    
	    System.out.println("둘레 :" +((width + heigth)*2));
	    
	    
	    
	}

}
