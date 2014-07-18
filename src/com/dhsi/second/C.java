package com.dhsi.second;

public class C {
	
		int getRateOfInterest(){return 0;} 
		 int speedlimit=90;  
  

void eat(){System.out.println("animal is eating...");}  
}  


class Dog extends C{  
void eat(){System.out.println("dog is eating...");}  
}  
  
class BabyDog extends Dog{  
public static void main(String args[]){  
C a=new BabyDog();  
a.eat();  
}}  
	
		