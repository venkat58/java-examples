package com.dhsi.db;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.dhsi.awt.LoginForm;

public class SbiAmountAdd extends Frame implements ActionListener {
	Label addAmountNumber,addAmount;
	TextField  cashAddNumberText,cashAddTextF;
	Button  logout,Add,back;
	SbiAmountAdd()
	{
		addAmountNumber=new Label("A/c Number");
		addAmountNumber.setBounds(50, 50, 90, 50);
		cashAddNumberText= new TextField();
		cashAddNumberText.setBounds(150, 50,200, 50);
		
		add(cashAddNumberText);
		
		 add(addAmountNumber);
		 
		addAmount=new Label("Amount");
		addAmount.setBounds(50, 150, 90, 50);
		cashAddTextF= new TextField();
		cashAddTextF.setBounds(150, 150, 200, 50);
		add(cashAddTextF);

		add(addAmount);
		
		logout= new Button("Logout");
		logout.setBounds(470, 50, 100, 50);
		logout.addActionListener(this);
		add(logout);
		back= new Button("Back");
		back.setBounds(360, 50, 100, 50);
		back.addActionListener(this);
		add(back);

		Add= new Button("Add Amount");
		Add.setBounds(50, 220, 150, 50);
		Add.addActionListener(this);
		add(Add); 
		
		setLayout(null);
		setSize(800, 800);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == Add){
			String number= cashAddNumberText.getText();
			String amount=cashAddTextF.getText();
			
			boolean numberValue= containsOnlyNumbers(number);
			boolean amountValue= containsOnlyNumbersAndAmount(amount);

			if(numberValue && amountValue){
			SbiAccount sa= new SbiAccount();
			try {
			String status=sa.addBalance(cashAddNumberText.getText(), cashAddTextF.getText());
			if(status.equals("added")) {
			JOptionPane.showMessageDialog(null,new String(status));
			}else{	JOptionPane.showMessageDialog(null,new String(status));
			}
			} catch (NumberFormatException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}else{
				JOptionPane.showMessageDialog(null,new String("Please enter correct number and amount?"));	
			}
		}else if(e.getSource()==logout)
		{
			this.setVisible(false);
			LoginForm g= new LoginForm();
			if(g.hm!=null){
			g.unameTxt.setText(g.hm.get("username"));
			g.pwdTxt.setText(g.hm.get("password"));
			}
		}else if(e.getSource()==back)
		{
			this.setVisible(false);
			try {
				new SbiView();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public boolean containsOnlyNumbers(String str) {
        
        //It can't contain only numbers if it's null or empty...
        if (str == null || str.length() < 0 )
            return false;
        /*
        for (int i = 0; i < str.length(); i++) {
 
            //If we find a non-digit character we return false.
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }*/
        if(!str.matches("^[0-9]{1,10}$"))
        {
        return false;	
        }
        return true;
    }
 
 public boolean containsOnlyNumbersAndAmount(String str) {
        
        //It can't contain only numbers if it's null or empty...
        if (str == null || str.length() < 0)
            return false;
        
        for (int i = 0; i < str.length(); i++) {
 
            //If we find a non-digit character we return false.
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        
        return true;
    }
 
	
	
}
