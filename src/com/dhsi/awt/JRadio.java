package com.dhsi.awt;

import javax.swing.*;  

import java.awt.event.*;  
public class JRadio extends JFrame implements ActionListener{ 
	
	JFrame f;  
	JRadio(){  
	    f=new JFrame("Combo ex");  
	      
	    String country[]={"India","Aus","U.S.A","England","Newzeland"};  
	      
	    JComboBox cb=new JComboBox(country);  
	    cb.setBounds(50, 50,90,20);  
	    f.add(cb);  
	      
	    f.setLayout(null);  
	    f.setSize(400,500);  
	    f.setVisible(true);  
	      
	}  
	public static void main(String[] args) {  
	    new JRadio();  
	      
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}  
	}  

