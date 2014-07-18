package com.dhsi.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Perf {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		LinkedList ll= new LinkedList<>();
		for(int i=0;i<10000;i++)
		{
			list.add(i);
			ll.add(i);
		}
		long startTime = System.currentTimeMillis();

		for(Object e : list)
		{
			//System.out.println(list);
		}
		long endTime   = System.currentTimeMillis();

		long totalTime = endTime - startTime;
		
		System.out.println("arraylist:"+totalTime);
		
		long startTime1 = System.currentTimeMillis();

		for(Object e : ll)
		{
			//System.out.println(list);
		}
		long endTime1   = System.currentTimeMillis();

		long totalTime1= endTime1 - startTime1;
		
		System.out.println("ll:"+totalTime1);
		
		
	}

}
