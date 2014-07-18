package com.dhsi.awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class RadioAppDemo extends Frame
{
      Checkbox cb1, cb2, cb3, cb4, cb5;
      Label l, l1;
      RadioAppDemo()
      {
    	  setSize (400, 400);
    	  setLayout (new FlowLayout ()); 
    	  CheckboxGroup cbg1=new CheckboxGroup();
    	  CheckboxGroup cbg2=new CheckboxGroup();
    	  cb1=new Checkbox ("C", cbg1, false);
    	  cb2=new Checkbox ("Cpp", cbg1, false);
    	  cb3=new Checkbox ("Java", cbg2, false);
    	  cb4=new Checkbox ("Oracle9i", cbg2, false);
    	  cb5=new Checkbox ("exit");
    	  l=new Label ("Course :");
    	  l1=new Label (); 
    	  add (l);
    	  add (cb1);
    	  add (cb2);
    	  add (cb3);
    	  add (cb4);
    	  add (cb5);
    	  add (l1);
    	  cb1.addItemListener (new itl ()); cb2.addItemListener (new itl ()); cb3.addItemListener (new itl ()); cb4.addItemListener (new itl ()); cb5.addItemListener (new itl ()); setVisible (true);
      
    	  List list = new List();
	      PopupMenu pp = new PopupMenu("my list");
	      pp.insert("fruits",0);pp.insert("seeds",1);pp.insert("rice",2); pp.insert("curries",3);
	      list.add(pp);
	      list.setSize(200, 200);
	      add(list);
	      
      }
 
      class itl implements ItemListener {
          public void itemStateChanged (ItemEvent ie)
          {
                Object obj=ie.getItemSelectable ();
                Checkbox cb=(Checkbox) obj;
                if (cb.getState())
                {
                      l1.setText ("U HAVE SELECTED "+cb.getLabel ());
                      String lab=cb.getLabel ();
                      if (lab.equalsIgnoreCase ("exit"))
                      {
                    	  System.exit(0);
                      }
                }
                      else{
                	l1.setText ("U HAVE SELECTED NONE");
                	}
      
      
}
      }
};

class RadioApp
{
	public static void main(String[] args) {
		new RadioAppDemo();
	}
}