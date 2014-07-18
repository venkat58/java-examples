package com.dhsi.awt;

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.dhsi.db.SbiAccount;
import com.dhsi.db.SbiView;

public class LoginForm extends Frame implements ActionListener,ItemListener{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Label uname,pwd;
	public TextField unameTxt,pwdTxt;
	Checkbox cb1,cb;
	Label l,l1;
	public static final String ICON_GLASS = "\uf000";
	public static HashMap<String, String> hm;
	boolean checkBoxSelected = false;
	
	public void StartButton() {
	    setTitle(String.valueOf('\u0f4b'));
	    setForeground(Color.BLACK);
	  }
	
public LoginForm(){  
//	setLayout(new GridLayout(3,1));
	
	
	uname=new Label("UserName");
	uname.setBounds(10, 50, 70, 50);
	unameTxt= new TextField();
	unameTxt.setBounds(90, 50, 200, 50);
	
	
	
	pwd=new Label("Password");
	pwd.setBounds(10, 120, 70, 50);
	pwdTxt= new TextField();
	pwdTxt.setBounds(90, 120, 200, 50);
	pwdTxt.setEchoChar('*');
	pwdTxt.setColumns(3);
	
	cb1=new Checkbox ("Save Password");
	cb1.setBounds(300, 120, 90, 50); 
    cb1.addItemListener (this);
	
   
   
	JButton b= new JButton("Login");
	b.setBounds(90, 200, 200, 50);
	b.addActionListener(this);	
	
	add(uname);add(unameTxt);add(pwd);add(pwdTxt);add(b); add(cb1);
	
setSize(800,800);
setLayout(null);
setVisible(true);
setTitle("SBI Login Page");
if(hm!= null)
{
	cb1.setState(true);
	unameTxt.setText(hm.get("username"));
	pwdTxt.setText(hm.get("password"));
}
	
}  
public static void main(String args[]){  
LoginForm f=new LoginForm();  
  
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	SbiAccount s= new SbiAccount();

	
	try {
		if(s.userValidation(unameTxt.getText(), pwdTxt.getText()))
		{
		try {
			synchronized (s) {
				
				SbiView sv= new SbiView();
//				unameTxt.setText(hm.get("username"));
//				pwdTxt.setText(hm.get("password"));
				if(checkBoxSelected)
				{	
					System.out.println("hi");
					hm= new HashMap<>();
		    	  hm.put("username",unameTxt.getText());
		    	  hm.put("password", pwdTxt.getText());	
		    	  System.out.println("h");
//		    	  l1.setText ("U HAVE SELECTED "+cb1.getLabel ());
					}else
					{
//				    	  l1.setText ("U HAVE SELECTED NONE");
				    	  System.out.println("un selected");	
					}
				}
				
			this.setVisible(false);

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setVisible(false);	
		}else{
			JOptionPane.showMessageDialog(null, "Please enter correct username and password ?");
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

}


public void itemStateChanged (ItemEvent ie)
{
      Object obj=ie.getItemSelectable ();
      Checkbox cb1= (Checkbox) obj;
      if (cb1.getState ())
      {
    	  checkBoxSelected=true;
    	
    	  System.out.println("selected");
      } else {
    	  checkBoxSelected = false;
    	 
      } 
      }



}  


class IconButtons extends JButton
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IconButtons() {
	    try {
	      InputStream in = this.getClass().getResourceAsStream("/fontawesome-webfont.ttf");
	      Font ttfBase = Font.createFont(Font.TRUETYPE_FONT, in);
	      Font ttfReal = ttfBase.deriveFont(Font.BOLD, 24);
	      setFont(ttfReal);
	    } catch (FontFormatException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	  }
}


