package com.example.mtdoumi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab2Activity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    TextView textView = new TextView(this);
        textView.setText("탭2");
        
        setContentView(textView);
        
	}

}
