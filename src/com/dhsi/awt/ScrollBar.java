package com.dhsi.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Scroll" width=300 height=300></applet>*/

public class ScrollBar extends Applet implements AdjustmentListener {

	      Scrollbar hsb, vsb;
	      int hr, vr;
	      public void init ()
	      {
	hsb=new Scrollbar (Scrollbar.HORIZONTAL, 10, 100, 10, 1000); vsb=new Scrollbar (Scrollbar.VERTICAL, 10, 100, 10, 1000); add (hsb);
	add (vsb);
	             hsb.addAdjustmentListener (this);
	             vsb.addAdjustmentListener (this);
	             setVisible (true);
	}
	public void adjustmentValueChanged (AdjustmentEvent ae) {
	             hr=hsb.getValue ();
	             vr=vsb.getValue ();
	             repaint ();
	      }
	      public void paint (Graphics g)
	      {
	}
	      
};
	
	

