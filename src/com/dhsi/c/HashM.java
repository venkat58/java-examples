package com.dhsi.c;

import java.util.*;  
class HashM{  
 public static void main(String args[]){  
   
  HashMap hm=new HashMap();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
  Set set=hm.entrySet();  
  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
	   Map.Entry m=(Map.Entry)itr.next();  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  } 
  
  ArrayList list= new ArrayList();
  HashMap mMap = new HashMap();
  mMap.put("start",1);
  mMap.put("text","yes");
  list.add(mMap); 
  mMap = new HashMap(); // create a new one!
  mMap.put("start",2);
  mMap.put("text","no");
  list.add(mMap); 
  
  
  
  Iterator itr1=list.iterator();  
  
  while(itr1.hasNext()){  
	   HashMap m= (HashMap) itr1.next(); 
	   
	   Set s= m.entrySet();
	   Iterator i=s.iterator();
	   while(i.hasNext()){
		   Map.Entry m1= (Map.Entry)i.next();
	   System.out.println(m1.getKey()+" "+m1.getValue());}  
	  } 
  
  
  
 }  
}  