package com.example.mtdoumi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Open extends SQLiteOpenHelper{

	public DB_Open(Context context){
		super(context, "db_user", null, 1);
	}
	
	public void onCreate(SQLiteDatabase db){
		db.execSQL("CREATE TABLE db_user" + "(groupname TEXT PRIMARY KEY," +"boy TEXT, girl TEXT, place TEXT);");
//		db.execSQL("INSERT INTO db_user"+ "(groupname, boy, girl, place)" + " VALUES(,,,);");
	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
//		db.execSQL("DROP TABLE IF EXIST db_user");
//		onCreate(db);
	}
}
