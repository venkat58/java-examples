package com.dhsi.second;

public class ExPropagation {

	void m(){
//int i=29,b=0;
//  try{ i=i/b;}catch(Exception Ae){ System.out.println("varia"); }
//	throw new Exception("devie");
//	   throw new java.lang.ArithmeticException("please make sure b value is not a 0");
try{
	
}catch(Exception a){try{}finally{}System.out.println("hi");}
    finally{try{}finally{} System.out.println("finally");}
	}
	
	void n(){
		m();
	}
	void p(){n();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExPropagation e= new ExPropagation();
e.p();

	
	}

}
