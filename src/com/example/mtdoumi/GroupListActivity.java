package com.example.mtdoumi;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
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
	
	private ListView listView;
	private ArrayList<String> arrayList;
	private ArrayAdapter<String> adapter;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_grouplist);
	    
	    
	    
	    // Making New Group
	    
	    ImageButton gonewgroup = (ImageButton)findViewById(R.id.newgroup);
	    gonewgroup.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(GroupListActivity.this, NewGroupActivity.class);
    			startActivity(intent2);
    		
			}	
			
		}
		);
		

		// ListView
	    arrayList = new ArrayList<String>();
	    
	    Intent intent = getIntent();
	    
	    if(intent.getExtras().isEmpty()){
	    	
	    }else{
	    	final String groupname = intent.getExtras().getString("groupname").toString();
		    final String boy = intent.getExtras().getString("boy").toString();
		    final String girl = intent.getExtras().getString("girl").toString();
		    final String place = intent.getExtras().getString("place").toString();
		    arrayList.add(groupname);
	    }
	    
	    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
	    
	    listView = (ListView)findViewById(R.id.listView1);
	    listView.setAdapter(adapter);
	    listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	    
	    listView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
				// TODO Auto-generated method stub
				String str = (String)adapter.getItem(position);
				
				Intent intent2 = new Intent(GroupListActivity.this, Group1Activity.class);
    			intent2.putExtra("groupname", groupname);
    			intent2.putExtra("boy", boy);
    			intent2.putExtra("girl", girl);
    			intent2.putExtra("place", place);

    			startActivity(intent2);
			}
	    	
	    });
	    // TODO Auto-generated method stub
	    
	}

}
