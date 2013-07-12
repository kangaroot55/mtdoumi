package com.example.mtdoumi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class NewGroupActivity extends Activity {

	
    EditText groupname,boy,girl,place;
    
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_newgroup);
	    // TODO Auto-generated method stub
	    

	    
	    groupname=(EditText)findViewById(R.id.tbGroupname);
	    boy=(EditText)findViewById(R.id.tbBoy);
	    girl=(EditText)findViewById(R.id.tbGirl);
	    place=(EditText)findViewById(R.id.tbPlace);
	    
        //Making Group Button
        ImageButton btnMakegroup = (ImageButton)findViewById(R.id.makinggroup);
        
        btnMakegroup.setOnClickListener(new Button.OnClickListener() {
        
        
        	public void onClick(View v) {
        			Intent intent = new Intent(NewGroupActivity.this, GroupListActivity.class);
        			intent.putExtra("groupname", groupname.getText().toString());
        			intent.putExtra("boy", boy.getText().toString());
        			intent.putExtra("girl", girl.getText().toString());
        			intent.putExtra("place", place.getText().toString());

        			startActivity(intent);
        			
        	}
        }
        );

	    
	    
	}

}
