package com.dhsi.f;
import com.dhsi.db.first;

import java.awt.*;  
import java.awt.event.*;  
  
class EventTest extends Frame implements ActionListener{  
TextField tf;
TextArea t;
EventTest(){  
  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
  
Button b=new Button("click me");  
b.setBounds(100,120,80,30); 
t= new TextArea();
t.setBounds(20, 150, 300, 300);
  
b.addActionListener(this);  
  
add(b);add(tf); add(t);  
  
setSize(500,500);  
setLayout(null);  
setVisible(true);  
  
}  
  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");
	first f= new first();
	String s = null;
	try {
		s = f.readDataBase();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
t.setText(s);

	
}  
  
public static void main(String args[]){  
new EventTest();  


}  
}  
