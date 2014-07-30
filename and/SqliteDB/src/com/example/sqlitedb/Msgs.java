package com.example.sqlitedb;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Msgs {
	public static void logMsg(String msg)
	{
	Log.d("venky", msg);
	}
	public static void toastMsg(Context c, String msg)
	{
	Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
	}
	
}
