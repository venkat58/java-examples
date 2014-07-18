package com.dhsi.c;
import com.dhsi.db.SbiAccount;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.dhsi.db.SbiAccount;

public class PQueue {

	private static Scanner sc;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PriorityQueue p= new PriorityQueue();
		p.add("1");
		p.add("2");
		p.add("3");
		p.add("4");
		p.offer("5");
		
//		System.out.println(p.element());
//		System.out.println(p.poll());
//		System.out.println(p.peek());
		for(Object obj:p)  {
		    System.out.println(obj);  
		 } 
		
	ll();
	al();
	hs();
	tm();
	alhm();
	prepare();
	}
static void ll()
{
	LinkedList<Integer > ll= new LinkedList<Integer>();
	ll.add(678);
	ll.add(678);
	ll.add(678);
	ll.add(678);
	ll.add(678);
	ll.add(678);
	ll.add(678);
	
	System.out.println(ll);
	ll.addFirst(567);
	ll.addLast(456);
System.out.println(ll);
}
static void al()
{
	ArrayList<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	
	System.out.println(al);
	
	ArrayList<Integer> al2=new ArrayList<>();
	al2.add(12);
	al2.add(12);
	al2.add(12);
	
	al.addAll(al2);
	al.addAll(al);
	System.out.println(al);
	
//	al.removeAll(al);
	System.out.println(al);
	
	
	
}

static void hs() throws Exception
{
	SbiAccount sa= new SbiAccount();

	
	Map<String, String> map = sa.getgetNames();
	for (Map.Entry<String, String> entry : map.entrySet()) {
	    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	
	
	
}

	
static void tm() 
{
	HashMap hm= new HashMap<>();
	TreeMap tm= new TreeMap<>();
	
	tm.put(1,7);
	tm.put(3,8);
	tm.put(4,29);
	tm.put(5,287);
	tm.put(6,24);
	
	System.out.println(tm);
	Map<String, String> tree = tm;

	for (Map.Entry entry : tree.entrySet()) {
	     System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
	}
	
	// not working in treemap for toarray()
	Set s1= tm.keySet();
	Object o[]= s1.toArray();
	for( int i=0;i<o.length;i++)
	{
		Object o1= hm.get(o[i]);
		Integer k= (Integer)o1;
		System.out.println(k);
	}
	
}
static void alhm() throws Exception
{
	System.out.println("executing alhm");
	SbiAccount sa= new SbiAccount();
	
	 ArrayList a= sa.getAllAccounts();
	 Iterator it= a.iterator();
	 while(it.hasNext()){
		 Map<String, Object> map = (Map<String, Object>) it.next();

		 for (Map.Entry<String, Object> entry : map.entrySet()) {
			    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		 
	 }
	 
	
}
static void prepare()
{
	System.out.println("hi");
	SbiAccount sa= new SbiAccount();
	HashMap< Integer, Integer> hm= new HashMap<>();
	String exit="";
//	String n="";
	sc = new Scanner(System.in);

	while(!exit.equals("e")){
	
	System.out.println("plase enter account number");
	 int number=sc.nextInt();


	System.out.println("plaese enter amount");
	int amount=sc.nextInt();

	hm.put(new Integer(number), new Integer(amount));;
	
	System.out.println("r u want ot exit press 'e'");
	exit=sc.next();
	
	}
	sa.updateMultileValues(hm);
	System.out.println("exit");
	
}


}

