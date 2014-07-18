package com.dhsi.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Third extends Frame implements ActionListener{
Button c,c1;
	Third()
{
		FlowLayout f= new FlowLayout();
		setLayout(f);
	c= new Button("previous");
	add(c);
	c1= new Button("Finish");
	add(c1);
	c.setForeground(Color.blue);

	c1.setBackground(Color.blue);

	c.addActionListener(this);
	c1.addActionListener(this);
	setTitle("third Window");
	setVisible(true);
	setSize(400,400);
}
	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		if(e.getSource()== c){
			Second g= new Second();
			this.setVisible(false);
				}else if(e.getSource() == c1)
				{
					LoginForm g= new LoginForm();
					this.setVisible(false);
				}
			}
		


}
