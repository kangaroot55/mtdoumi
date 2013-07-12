package com.example.mtdoumi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Group1Activity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_group1);
	  
	    // TODO Auto-generated method stub
	    
	    Intent intent = getIntent();
	    
	    String groupname = intent.getExtras().getString("groupname").toString();
	    String boy = intent.getExtras().getString("boy").toString();
	    String girl = intent.getExtras().getString("girl").toString();
	    String place = intent.getExtras().getString("place").toString();
	    TextView tv = (TextView) findViewById(R.id.textgroupname);
	    TextView tv2 = (TextView) findViewById(R.id.textboy);
	    TextView tv3 = (TextView) findViewById(R.id.textgirl);
	    TextView tv4 = (TextView) findViewById(R.id.textplace);
	    tv.setText("그룹 이름 : "+groupname);
	    tv2.setText("남자 : "+boy+"명");
	    tv3.setText("여자 : "+girl+"명");
	    tv4.setText("MT 장소 : "+place);
	}

}
