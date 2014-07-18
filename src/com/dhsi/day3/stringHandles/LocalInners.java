package com.dhsi.day3.stringHandles;

public class LocalInners {
	static{System.out.println("hi welcome");}
	private int data=30;
	void display()
	{
	class Local{
		void msg(){System.out.println(data);
	}
	}
	Local l=new Local();
	l.msg();
	}
	public static void main(String[] args) {
		LocalInners obj= new LocalInners();
		obj.display();
	}
	
	
}


class Simple{
	private int data = 20;
	void display(){
		final int value=50;
		class Local1{
			void msg(){System.out.println(data+value);}
		}
	Local1 l1= new Local1();
	l1.msg();
	}
	public static void main(String[] args) {
		Simple obj=new Simple();
		obj.display();
	}
	
}