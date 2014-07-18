package com.dhsi.frist;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		  
		System.out.println(sb);//prints Hello Java  
		sb.insert(2,"Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  

		sb.replace(2,5,"Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		System.out.println(sb.length());
		
		sb.delete(2,7);//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	}

}
