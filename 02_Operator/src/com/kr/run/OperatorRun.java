package com.kr.run;

import com.kr.operater.A_LogicalNegation;
import com.kr.operater.B_lnDecrease;
import com.kr.operater.C_Arithmetic;
import com.kr.operater.D_Comparison;
import com.kr.operater.E_Logical;

public class OperatorRun {
	
	//퍼스보매
	public static void main(String[]args) {
		
		A_LogicalNegation a= new A_LogicalNegation();
		//a.method1();
		
		B_lnDecrease b = new B_lnDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		
		C_Arithmetic c = new C_Arithmetic();
		
		//c.method1();
		
		D_Comparison d = new D_Comparison();
		//d.method1();
		//d.method2();
		
		E_Logical e = new E_Logical();
		//e.method1();
		//e.method2();
		//e.method3();
		//e.method4();
		e.method5();
		
	}

}
