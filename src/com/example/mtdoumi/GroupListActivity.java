package com.example.mtdoumi;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class GroupListActivity extends Activity {

	/** Called when the activity is first created. */

	public class grouping{
		 
		String groupname, boy, girl, place;
		grouping(String s1,String s2,String s3,String s4){
			groupname = s1;
			boy=s2;
			girl=s3;
			place=s4;
		}
	}

	
	private static final int B_ACTIVITY = 1;
	
	private grouping li[]= new grouping[30];
	private int licnt=0;
	private ListView listView;
	private ArrayList<String> arrayList;
	private ArrayAdapter<String> adapter;
	
	SQLiteDatabase db;
	DB_Open db_open;
	
	
	
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_grouplist);
	    
	    
	    
	    db_open = new DB_Open(this);
		db = db_open.getWritableDatabase();
		
		// Making New Group
	    
	    ImageButton gonewgroup = (ImageButton)findViewById(R.id.newgroup);
	    gonewgroup.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(GroupListActivity.this, NewGroupActivity.class);
    			startActivityForResult(intent2,B_ACTIVITY);
    		
			}	
			
		}
		);
		

	    
	    Cursor c = db.rawQuery("SELECT groupname FROM db_user" , null);
	    c.moveToFirst();
	    
	    
		// ListView
	    arrayList = new ArrayList<String>();
	    
	    adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
	    
	    listView = (ListView)findViewById(R.id.listView1);
	    listView.setAdapter(adapter);
	    listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	    
	    
	    for(int i=0;i<c.getCount();i++){
	    	adapter.add(c.getString(0));
	    	c.moveToNext();
	    }
	    
	    adapter.notifyDataSetChanged();
	    
	    
	    listView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
				// TODO Auto-generated method stub
		
				
				Intent a_i = new Intent(GroupListActivity.this, Group1Activity.class);
				
				Cursor c = db.rawQuery("SELECT groupname, boy, girl, place FROM db_user",null);
			    c.moveToPosition(position);
			    
			    
				a_i.putExtra("groupname", c.getString(0));
				a_i.putExtra("boy", c.getString(1));
				a_i.putExtra("girl", c.getString(2));
				a_i.putExtra("place", c.getString(3));
				startActivity(a_i);
				
			}
	    	
	    });
	    // TODO Auto-generated method stub
	    
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent){
		super.onActivityResult(requestCode, resultCode, intent);

		Bundle extraBundle;
		
		switch (requestCode) {
			case B_ACTIVITY:
				if (resultCode == RESULT_OK) { 
					extraBundle = intent.getExtras();
					String n1 = extraBundle.getString("groupname");
					String n2 = extraBundle.getString("boy");
					String n3 = extraBundle.getString("girl");
					String n4 = extraBundle.getString("place");
//					li[licnt++]=new grouping(n1,n2,n3,n4);
//					db.execSQL("INSERT INTO db_user(groupname, boy, girl, place) VALUES ('" + n1 + "', '" + n2 + "', '" + n3 + "', '" + n4 + "')");
					
					adapter.add(n1);
					adapter.notifyDataSetChanged();
					
				}
		}
	}
}
