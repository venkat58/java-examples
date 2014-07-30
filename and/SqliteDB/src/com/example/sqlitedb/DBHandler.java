package com.example.sqlitedb;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHandler extends SQLiteOpenHelper{
	//database version number
	public static final int version = 1;
	// database name 
	 private static final String DATABASE_NAME = "contactsManager";  
	    private static final String TABLE_CONTACTS = "contacts";  
	     private static final String KEY_ID = "id";  
	    private static final String KEY_NAME = "name";  
	    private static final String KEY_PH_NO = "phone_number";  
	

	public DBHandler(Context context) {
		super(context, DATABASE_NAME	, null, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		String create_table_contacts="create table "+TABLE_CONTACTS+"("+KEY_ID+"integer primary key,"+KEY_NAME+"text,"+KEY_PH_NO+"text"+")";
		db.execSQL(create_table_contacts);
		Msgs.logMsg("table created");
		}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		  // Drop older table if existed  
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);  
        // Create tables again  
        onCreate(db);  
	}
void addContact(Contact contact)
{
	SQLiteDatabase db= this.getWritableDatabase();
	ContentValues values= new ContentValues();
	values.put(KEY_NAME,contact.getName());
	values.put(KEY_PH_NO, contact.getPh());
	// insert row values to database
    Msgs.logMsg(values.getAsString(KEY_NAME));

	db.insert(TABLE_CONTACTS, null, values);
	db.close();
	
}
Contact getContact(int id)
{
	SQLiteDatabase db= getReadableDatabase();
	Cursor cursor= db.query(TABLE_CONTACTS, new String[]{KEY_ID,KEY_NAME,KEY_PH_NO}, KEY_ID+"=?", new String[]{String.valueOf(id)}, null, null, null, null);
	 if (cursor != null)  
         cursor.moveToFirst();  

     Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),  
             cursor.getString(1), cursor.getString(2));  
     // return contact  
     return contact;  
     
}

// code to get all contacts in a list view  
public List<Contact> getAllContacts() {  
    List<Contact> contactList = new ArrayList<Contact>();  
    // Select All Query  
    String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;  

    SQLiteDatabase db = this.getWritableDatabase();  
    Cursor cursor = db.rawQuery(selectQuery, null);  

    // looping through all rows and adding to list  
    if (cursor.moveToFirst()) {  
        do {  
            Contact contact = new Contact();  
            contact.setId(Integer.parseInt(cursor.getString(0)));  
            contact.setName(cursor.getString(1));  
            contact.setph(cursor.getString(2));  
            // Adding contact to list  
            contactList.add(contact);  
        } while (cursor.moveToNext());  
    }  

    // return contact list  
    return contactList;  
}  

// code to update the single contact  
public int updateContact(Contact contact) {  
    SQLiteDatabase db = this.getWritableDatabase();  

    ContentValues values = new ContentValues();  
    values.put(KEY_NAME, contact.getName());  
    values.put(KEY_PH_NO, contact.getPh());  
    Msgs.logMsg(values.getAsString(KEY_ID));
    // updating row  
    return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",  
            new String[] { String.valueOf(contact.getId()) });  
}  

// Deleting single contact  
public void deleteContact(Contact contact) {  
    SQLiteDatabase db = this.getWritableDatabase();  
    db.delete(TABLE_CONTACTS, KEY_ID + " = ?",  
            new String[] { String.valueOf(contact.getId()) });  
    db.close();  
}  

// Getting contacts Count  
public int getContactsCount() {  
    String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;  
    SQLiteDatabase db = this.getReadableDatabase();  
    Cursor cursor = db.rawQuery(countQuery, null);  
    cursor.close();  

    // return count  
    return cursor.getCount();  
}  
}
