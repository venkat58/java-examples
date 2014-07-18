package com.dhsi.test;

public class Buf {
public static void main(String[] args) {
	StringBuffer b= new StringBuffer("helloj");
b.replace(2, 3, "java");
b.delete(2,7);
b.insert(2,"ll");
System.out.println(b);
}
}
