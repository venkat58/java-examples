package com.dhsi.c;
import java.util.*;

import com.dhsi.frist.student;

public  class ArrayListDemo  
{
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("hi");
		al.add(1);
		al.add("fd");
		al.add("wiat");
		al.add("fr");
		al.add("u");
		al.add("only");
		ArrayList list= new ArrayList();
		list.add("hi");
		list.add(1);
		list.add("fd");
		list.add("wiat");
		list.add("fr");
		list.add("u");
		list.add("only");
		
		al.addAll(list);
		
		
	Iterator it= al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	ArrayList a= new ArrayList();
	Student s1= new Student(1, "venky", 560);
	Student s2= new Student(2, "ps", 560);
	Student s3= new Student(3, "raju", 560);
	
	a.add(s1);
	a.add(s2);
	a.add(s3);
	
	for (Object obj:a)
	{
		Student st= (Student)obj;
		System.out.println("n number is "+st.rNo+" name "+st.name+" marks"+st.marks); 
	}
	
	}
}