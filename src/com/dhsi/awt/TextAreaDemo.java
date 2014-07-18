package com.dhsi.awt;


	
	import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.Applet.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
	/*<applet code="TextareaApp" height=200 width=200>
	</applet>*/
	public class TextAreaDemo extends Applet
	{
	    private DefaultListModel listModel;

		Label l1, l2;
		TextField tf;
		TextArea ta;
		 JList list;
		 
		public void init ()
		{
		      setBackground (Color.yellow);
		      l1=new Label ("Enter a text");
		      l2=new Label ("Copied text");
		      tf=new TextField (20);
		      ta=new TextArea (); 
		     

		        listModel = new DefaultListModel();
		        listModel.addElement("Jane Doe");
		        listModel.addElement("John Smith");
		        listModel.addElement("Kathy Green");
			     list = new JList(listModel);

		      
		      add(list);
		      add (l1);add (l2);add (tf);add (ta);
		}
		public void start ()
		{
		      tf.addTextListener (new tl ());
		      
		}
		
		class tl implements TextListener
		{
		      public void textValueChanged (TextEvent te)
		      {
		    	  ta.setText ("");
		    	  String s=tf.getText ();
		    	  ta.append (s+"\n");
		      }
		      }
		
	};

