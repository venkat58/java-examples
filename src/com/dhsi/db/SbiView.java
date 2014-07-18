package com.dhsi.db;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.html.ListView;

import com.dhsi.awt.LoginForm;

public class SbiView extends Frame implements ActionListener,ListSelectionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label lblName,lblBalance,lblStatus,lblNumber,addAmount,addAmountNumber;
	TextField txtName,txtBalance,txtStatus,txtNumber,cashAddText,cashAddNumberText;
	Button details,Add,logout;
    private DefaultListModel listModel;
    JList numbersList;
	int number;
	double amount;
	private String[] sses;
	JComboBox cb;
	
	public SbiView() throws Exception
	{
//		FlowLayout(int align, int hgap, int vgap)
		SbiAccount s= new SbiAccount();
		HashMap<String,String> hs= s.getgetNames();
		Set<Entry<String, String>> h= hs.entrySet();
		Iterator i= h.iterator();
		while (i.hasNext())
		{
			Map.Entry m= (Map.Entry)i.next();
			System.out.println(m.getKey()+"value"+m.getValue());
		}
				
		lblNumber=new Label("Number");
		lblNumber.setBounds(10, 50, 70, 50);
		txtNumber= new TextField();
		txtNumber.setBounds(90, 50, 200, 50);	
		
	/*	 listModel = new DefaultListModel();
	      ArrayList numbersL=s.getAccountNumbersList();
	      if(!numbersL.isEmpty()){
	    	  Iterator e = numbersL.iterator();
	    	    while (e.hasNext()) {
	    	      String f= (String) e.next();
	    	      listModel.addElement(f);
	    	      System.out.println(s);
	    	    }
	      }
	      
	    numbersList= new JList(listModel); 
		numbersList.setBounds(300, 50, 100, 100);

		numbersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		numbersList.setSelectedIndex(0);
		numbersList.addListSelectionListener((ListSelectionListener) this);
		numbersList.setVisibleRowCount(5);
		
		add(numbersList); */
		Object[] stock_list = s.getAccountNumbersList().toArray();

		
//		String[] numbersList=s.getAccountNumbersList();
	      
	    cb=new JComboBox(stock_list);  
	    cb.setBounds(320, 50,90,20);  
	    add(cb); 
	    cb.addActionListener(this);
	    
		
//		add(numbersList,BorderLayout.NORTH);
		lblName=new Label("name");
		lblName.setBounds(10, 120, 70, 50);
		txtName= new TextField();
		txtName.setBounds(90, 120, 200, 50);
		
		
	lblStatus=new Label("Status");
	lblStatus.setBounds(10, 190, 70, 50);
	txtStatus= new TextField();
	txtStatus.setBounds(90, 190, 200, 50);
	
	
	lblBalance=new Label("Balance");
	lblBalance.setBounds(10, 260, 70, 50);
	txtBalance= new TextField();
	txtBalance.setBounds(90, 260, 200, 50);
	
	
	
	details= new Button("Details");
	details.setBounds(420, 50, 100, 50);
	details.addActionListener(this);
	
	logout= new Button("Logout");
	logout.setBounds(650, 50, 100, 50);
	logout.addActionListener(this);
	
	Add= new Button("Add Amount");
	Add.setBounds(450, 350, 150, 50);
	Add.addActionListener(this);
	
	add(Add); add(details); add(txtName); add(lblName);
	add(lblNumber); add(txtBalance);
	add(lblBalance); add(lblStatus);add(txtStatus); add(txtNumber);
	add(logout);
	
	setName("venky Account");
	
	setSize(800,800);  
	setLayout(null); 
//	setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == details)  
		{
			 String number=txtNumber.getText();
			boolean numberValue= containsOnlyNumbers(number);
			 System.out.println(number);
			if(!numberValue){
				JOptionPane.showMessageDialog(null,new String("Please enter correct number?"));
			}else{
				SbiAccount sa= new SbiAccount();
			try {
				HashMap<String,	 String> hm= new HashMap<>();
			hm =	sa.getAccountDetails(txtNumber.getText());
			txtNumber.setText(hm.get("ACNO"));
			txtName.setText(hm.get("NAME"));
			txtBalance.setText(hm.get("BALANCE"));
			txtStatus.setText(hm.get("STATUS"));
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
			
		}else if(e.getSource() == Add)
		{ 
			System.out.println("add");
			this.setVisible(false);
		new SbiAmountAdd();
		}
		else if(e.getSource() == logout)
		{
			this.setVisible(false);
				LoginForm g= new LoginForm();
				if(g.hm!=null){
				g.unameTxt.setText(g.hm.get("username"));
				g.pwdTxt.setText(g.hm.get("password"));
				}
				
		}else if(e.getSource()==cb)
		{
			String d= (String) cb.getSelectedItem();
			txtNumber.setText(d) ;
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


	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (e.getValueIsAdjusting() == false) {

			if (numbersList.getSelectedIndex() == -1) {
            //No selection, disable fire button.

            } else {
            //Selection, enable the fire button.
            	txtNumber.setText((String) numbersList.getSelectedValue());
            	
            }
        }
		
	}
	
}
