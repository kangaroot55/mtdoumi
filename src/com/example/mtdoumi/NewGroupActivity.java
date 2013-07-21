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
    Bundle extra, extra2;
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
        		
        		extra = new Bundle();
        		extra2 = new Bundle();
        		Intent intent = new Intent(); //초기화 깜빡 했다간 NullPointerException이라는 짜증나는 놈이랑 대면하게 된다.
        		 
        		extra.putString("groupname", groupname.getText().toString());
        		extra.putString("boy", boy.getText().toString());
        		extra.putString("girl", girl.getText().toString());
        		extra.putString("place", place.getText().toString());
        		intent.putExtras(extra);
        		
        		
        		setResult(RESULT_OK, intent); // 성공했다는 결과값을 보내면서 데이터 꾸러미를 지고 있는 intent를 함께 전달한다.
        		
        		Intent intent2 = new Intent(NewGroupActivity.this, GroupListActivity.class); //초기화 깜빡 했다간 NullPointerException이라는 짜증나는 놈이랑 대면하게 된다.
       		 
        		extra2.putString("groupname", groupname.getText().toString());
        		extra2.putString("boy", boy.getText().toString());
        		extra2.putString("girl", girl.getText().toString());
        		extra2.putString("place", place.getText().toString());
        		intent2.putExtras(extra2);
        		
//        		setResult(RESULT_OK, intent2); // 성공했다는 결과값을 보내면서 데이터 꾸러미를 지고 있는 intent를 함께 전달한다.
        		
//        		startActivity(intent2);
        		
        		finish();
        	}
       	}
       );

	    
	    
	}

}
