package com.dhsi.files;

import java.util.Date;

public class DateForm {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.toString());
		String s= String.format("For Date:%tc", d);
				System.out.println(s);
	}

}
