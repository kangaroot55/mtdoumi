package com.example.mtdoumi;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
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

	    arrayList = new ArrayList<String>();
	    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
	    
	    listView = (ListView)findViewById(R.id.listView1);
	    listView.setAdapter(adapter);
	    listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	    
	    listView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
				// TODO Auto-generated method stub
				String str = (String)adapter.getItem(position);
		    		
			}
	    	
	    });
	    // TODO Auto-generated method stub
	    
	}

}
