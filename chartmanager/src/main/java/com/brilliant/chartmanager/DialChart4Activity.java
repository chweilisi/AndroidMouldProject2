package com.brilliant.chartmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.brilliant.chartlibrary.view.DialChart07View;

import java.util.Random;


public class DialChart4Activity extends Activity {
	
	DialChart07View chart = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//activity_dial_chart4
		setContentView(R.layout.activity_dial_chart4); 
		
		chart = (DialChart07View)findViewById(R.id.circle_view);  
		
		final Button button = (Button)findViewById(R.id.button1); 
		
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int max = 100;
			    int min = 1;
				Random random = new Random();
				int p = random.nextInt(max)%(max-min+1) + min;					
				float pf = p / 100f;
				chart.setCurrentStatus(pf);
				chart.invalidate();
			}
			
		  }
		);
				
		
	}
}
