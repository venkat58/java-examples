package com.dhsi.f;

import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class EventHand extends Applet implements ActionListener{  
Button b;  
TextField tf,tf1;
Label l;
  
public void init(){  
tf=new TextField();  
tf.setBounds(30,40,150,20);

tf1=new TextField();  
tf1.setBounds(30,60,150,20);

l=new Label("welcome to DHSI");
l.setBounds(30,5,150,20);
  
b=new Button("Click");  
b.setBounds(80,150,60,50);  
  
add(b);add(tf); add(l); add(tf1);  
b.addActionListener(this);  
  
setLayout(null);  
}  
  
 public void actionPerformed(ActionEvent e){ 
	 String s=tf.getText();
  tf1.setText(s);  
 }   
}