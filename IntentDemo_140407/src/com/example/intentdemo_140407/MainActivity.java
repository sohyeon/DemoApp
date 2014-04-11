package com.example.intentdemo_140407;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText uristring;
	Button intentcall_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        uristring = (EditText)findViewById(R.id.URIstring);
        intentcall_btn = (Button)findViewById(R.id.btn_intentcall);
        
        intentcall_btn.setOnClickListener(mClick);
    }
    	
    Button.OnClickListener mClick = new OnClickListener() {
    	
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String number = uristring.getText().toString();
			Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
			startActivity(intent);
		}
    };
}