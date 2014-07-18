package com.dhsi.second;
public class Ex1 {
public static void main(String[] args) {
	try{int x= Integer.parseInt("hi");
	System.out.println("values of x="+x);
	}catch(NumberFormatException nfe){
		System.out.println("enter only number values");
	}
}
}
