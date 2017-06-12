package com.brilliant.chartmanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;

@SuppressLint("NewApi")
public class HLNScrollActivity extends Activity {

	HorizontalScrollView horiView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hlnscroll);
		
		this.setTitle("折线图左右滑动");
			
		horiView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView1);
		//horiView.setPadding(70, 0, 0, 0);
	
		
		//设置horizontalScrollvView拉到头和尾的时候没有阴影颜色
		horiView.setOverScrollMode(View.OVER_SCROLL_NEVER);
	}
}
