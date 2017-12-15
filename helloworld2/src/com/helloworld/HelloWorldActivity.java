package com.helloworld;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloWorldActivity extends Activity implements View.OnClickListener{
	public Button button;
	public int touchCount;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		button=new Button(this);
		button.setText("Touch me!");
		button.setOnClickListener(this);
		setContentView(button);
	}
	public void onClick(View v) {
		touchCount++;
		button.setText("Touched me "+ touchCount +" time(s)");
		
	}
	
}//