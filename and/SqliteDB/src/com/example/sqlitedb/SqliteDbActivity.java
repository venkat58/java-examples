package com.example.sqlitedb;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SqliteDbActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sqlite_db);
		
		   
        DBHandler db = new DBHandler(this);  
           
         // Inserting Contacts  
       Msgs.logMsg("inserting ...");
        db.addContact(new Contact("Ravi", "9100000000"));  
        db.addContact(new Contact("Srinivas", "9199999999"));  
        db.addContact(new Contact("Tommy", "9522222222"));  
        db.addContact(new Contact("Karthik", "9533333333"));  
   
        // Reading all contacts  
        Msgs.logMsg("Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();         
   
        for (Contact cn : contacts) {  
         String log = "Id: "+cn.getId()+" ,Name: " + cn.getName() + " ,Phone: " +   
            cn.getPh();  
        // Writing Contacts to log  
        Msgs.logMsg(log);  
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sqlite_db, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
