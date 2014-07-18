package com.dhsi.f;


import java.awt.*;  
import java.applet.*;  

public class first extends Applet {  
	
Image picture;  
  String s="";
  public void init() {  
s=s+"init";  }  
  public void start() {  
s=s+"stop";	  }
  public void distroy() {  
s=s+"destroy";	  }
 
    
  public void paint(Graphics g) {  
    Font f= new Font("arial" ,60, 60);
    g.setFont(f);
    g.drawString(s, 150, 150);
    
	  
  }  
}  
