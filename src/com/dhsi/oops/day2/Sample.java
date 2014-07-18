package com.dhsi.oops.day2;

abstract public class Sample {

	void sum(){
		System.out.println("summation");
	}
	
}

class Sample1 extends Sample{
public static void main(String[] args) {
	Sample1 s = new Sample1();
	s.sum();
}
}