package com.dhsi.second;

public class Supr extends Sx {
	
	int speed=50;
	
	void test()
	{
		System.out.println(super.speed);
	}
public static void main(String[] args) {
	Supr s= new Supr();
	s.test();
}

}

class Sx
{
	int speed=100;
}