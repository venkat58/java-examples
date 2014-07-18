package com.dhsi.f;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;


public class DataOP {
	
	private static Socket soc;
	private static Scanner s;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		OutputStream output = null;
	 
		try {
	 
			output = new FileOutputStream("config.properties");
	 
			// set the properties value
			prop.setProperty("database", "jdbc:mysql://localhost/SBI");
			prop.setProperty("dbuser", "root");
			prop.setProperty("dbpassword", "");
	 
			// save properties to project root folder
			prop.store(output, null);
	 
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	 
		}
	}
}
