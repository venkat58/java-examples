package com.dhsi.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Second extends Frame implements ActionListener{
	Button b,b1;
Second()
{
	FlowLayout f= new FlowLayout();
	setLayout(f);
	
	b= new Button("Back");
	b1= new Button("Next");
	b.setBackground(Color.blue);
	b1.setBackground(Color.blue);

	add(b);
  add(b1);
	setTitle("Second Window");
	setSize(400,400);
	setVisible(true);
b.addActionListener(this);
	b1.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== b){
		this.setVisible(false);

LoginForm g= new LoginForm();

	}else if(e.getSource() == b1){
		this.setVisible(false);

		Third t= new Third();
	}
}

	
}
