package com.example.ff.classwork;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Activity1 extends Activity {
	
	/** Called when the activity is first created. */
	private static final String TAG = "Activity1";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e(TAG,"onCreate");
        Button button = (Button)findViewById(R.id.button);
        button.setText("1");
        Button otherButton = (Button)findViewById(R.id.otherbutton);
        otherButton.setText("3");
		final String str = " {\"look_time\": \"10w+\",\n" +
				"            \"userthunm\": \"0\",\n" +
				"            \"article\": [\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e03e6bf3.gif\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e30065b8.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11ea427e64.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e70d99dc.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e78aac9c.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e4044355.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e4eb801c.jpg\",\n" +
				"                \"http://app.bimuwang.com/upload/articlePictures/58c11e86f06e9.jpg\"\n" +
				"            ]\n" +
				"        }";
		final String str2 = " {\"look_time\": \"10w+\",\n" +
				"            \"userthunm\": \"0\",\n" +
				"            \"article\": [\n"+
				"            ]\n" +
				"        }";
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//
//				Intent intent = new Intent( Activity1.this,Activity2.class);
//				startActivity(intent);
				Gson gson = new Gson();
				Test test = gson.fromJson(str,new TypeToken<Test>(){}.getType());
				Test test2 = gson.fromJson(str2,new TypeToken<Test>(){}.getType());
				Log.d("yah",test.toString());
			}
		});
        
        otherButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  Intent intent = new Intent( Activity1.this,Activity3.class);
				  startActivity(intent);
			}
		});


    }
    
    @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		 super.onStart();
		 Log.e(TAG,"onStart");
	}
    
    @Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		Log.e(TAG,"onRestoreInstanceState");
	}
	
    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 Log.e(TAG,"onResume");
	}
    
    @Override
	protected void onSaveInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(savedInstanceState);
		Log.e(TAG,"onSaveInstanceState");
	}
    
    @Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		 Log.e(TAG,"onRestart");
	}
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		 Log.e(TAG,"onPause");
	}
    @Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		 Log.e(TAG,"onStop");
	}
    
    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		 Log.e(TAG,"onDestroy");
	}
}

  






