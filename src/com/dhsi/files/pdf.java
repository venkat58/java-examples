package com.dhsi.files;
import java.io.*;  

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;

public class pdf {
	
	 public static void main(String args[])throws Exception{  
	  
	 try{
		 File file = new File("itext_test.pdf");
		 FileOutputStream fileout  =  new FileOutputStream(file);
		 
		 Document doc= new Document();
		 PdfWriter.getInstance(doc, fileout);
		 doc.open();
		 Chunk ch= new Chunk("my text");
		 doc.add(ch);
		 doc.close();
		 
	 }catch(Exception e){}finally {System.out.println("success..");}
	 
	} 
	 
}
