package com.dhsi.files;
import java.io.*;  

public class Piped{
	  
	public static void main(String args[])throws Exception{  
	  
	final PipedOutputStream pout=new PipedOutputStream();  
	final PipedInputStream pin=new PipedInputStream();  
	  
	pout.connect(pin);//connecting the streams  
	  
	//creating one thread t1 which writes the data  
	Thread t1=new Thread(){  
	public void run(){  
	for(int i=65;i<=90;i++){  
	try{  
	  
	pout.write(i);  
	Thread.sleep(1000);  
	  
	}catch(Exception e){}  
	}  
	}  
	};
	}
}
