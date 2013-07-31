package com.example.mtdoumi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Tab1Activity extends Activity {

	private ListView listView;
	private ArrayAdapter<String> adapter;
	SQLiteDatabase db;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	  
	    
        setContentView(R.layout.activity_tab1);
       /*
        db_open = new DB_Open(this);
		db = db_open.getWritableDatabase();
		
		db.execSQL("CREATE TABLE if not exists db_mtpeople(name) references db_user(groupname) on DELETE set null deferrable initially deferred");
		
        Cursor c = db.rawQuery("SELECT name FROM db_mtpeople" , null);
	    c.moveToFirst();
	    */
	    adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
	    
	    listView = (ListView)findViewById(R.id.mtpeople);
	    listView.setAdapter(adapter);
	    listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
/*
	    for(int i=0;i<c.getCount();i++){
	    	adapter.add(c.getString(0));
	    	c.moveToNext();
	    }
*/
	    
	    
	    ImageButton addperson = (ImageButton)findViewById(R.id.addperson);
	    addperson.setOnClickListener(new ImageButton.OnClickListener(){

			DB_Open db_open;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				Context mContext = getApplicationContext();
	             LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
	             final View layout = inflater.inflate(R.layout.custom_dialog,(ViewGroup) findViewById(R.id.layout_root));
	                   
	             AlertDialog.Builder aDialog = new AlertDialog.Builder(Tab1Activity.this);//�ш린��uttontest���⑦�吏��由�	             aDialog.setTitle("�대�������댁＜�몄�~~");
	             aDialog.setView(layout);
	                   
	             aDialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
	              public void onClick(DialogInterface dialog, int which) {
	            	  EditText et;
	            	  et = (EditText)layout.findViewById(R.id.putname);
	            	  String name = et.getText().toString();
	      
	            	  adapter.add(name);
	    //        	  db.execSQL("INSERT INTO db_mtpeople(name) VALUES ('" + name + "')");
	    
	            	  TextView total;
	            	  total = (TextView)findViewById(R.id.total);
	            	  total.setText("총"+adapter.getCount()+"명");
	          	    
	              }
	             });
	             
	             aDialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
	              public void onClick(DialogInterface dialog, int which) {
	            	
	              }
	             });
	             
	             AlertDialog ad = aDialog.create();
	             ad.show();
	             
			}	
			
		}
		);

        
        
        
	}

}
