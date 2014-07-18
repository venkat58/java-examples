package com.dhsi.db;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleAppletDb extends Frame implements ActionListener {
	TextArea t;

	public ExampleAppletDb() {
		// TODO Auto-generated constructor stub
		t= new TextArea();
	t.setBounds(10, 50, 400, 400);
	Button b= new Button("Display");
	b.setBounds(20, 450, 100, 40);
	b.addActionListener(this);
	add(t);add(b);
	setSize(500,500);  
	setLayout(null);  
	setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExampleAppletDb e= new ExampleAppletDb();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		SecondDB s= new SecondDB();
		String d= s.ReadDB();
		t.setName("venky");
		t.setText(d);
		
	}

}
