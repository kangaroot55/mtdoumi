package com.example.mtdoumi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		ImageButton gotab = (ImageButton)findViewById(R.id.mainbutton2);
		gotab.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent tabintent = new Intent(MainActivity.this, TabWidgetActivity.class);
    			startActivity(tabintent);
    		
			}	
			
		}
		);
		
		ImageButton gogrouplist = (ImageButton)findViewById(R.id.mainbutton1);
		gogrouplist.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(MainActivity.this, GroupListActivity.class);
    			startActivity(intent2);
    		
			}	
			
		}
		);
		
		ImageButton goinfo = (ImageButton)findViewById(R.id.goinfo);
		goinfo.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Info_MainActivity.class);
    			startActivity(intent);
    		
			}	
			
		}
		);
    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
