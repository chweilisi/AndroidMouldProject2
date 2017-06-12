package com.brilliant.chartmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView mListView = new ListView(this);

        SimpleAdapter adapter = new SimpleAdapter(this, getData(),
                android.R.layout.simple_list_item_2,
                new String[]{"title", "description"},
                new int[]{android.R.id.text1, android.R.id.text2});

        mListView.setAdapter(adapter);

        final LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(mListView);

        setContentView(layout);

        OnItemClickListener listener = new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    android.view.View view, int position, long id) {
                // TODO Auto-generated method stub

                String chartsTitleCurr[] = getResources().getStringArray(R.array.chartsTitle);
                if (position > chartsTitleCurr.length - 1) return;

                Bundle bundleSimple = new Bundle();
                Intent intent = new Intent();
                bundleSimple.putString("title", chartsTitleCurr[position]);

                int id_desc_3_4 = chartsTitleCurr.length - 4;

                if (position == chartsTitleCurr.length - 1) //倒数1 仪表盘
                {
                    intent.setClass(MainActivity.this, GaugeChartActivity.class);

                } else if (position == chartsTitleCurr.length - 2) //倒数2  圆/半圆图
                {
                    intent.setClass(MainActivity.this, CircleChartActivity.class);
                    //}else if(position >= id_desc_1_2_3) //倒数1,2,3 seekbar图
                    //{
                    //	 position = chartsTitleCurr.length - 1 - position;
                    //	 intent.setClass(MainActivity.this,SeekBarActivity.class);
                } else if (position >= id_desc_3_4) //倒数3,4 同源汇总图
                {
                    position = chartsTitleCurr.length - 3 - position;
                    intent.setClass(MainActivity.this, SpinnerActivity.class);
                } else if (position >= chartsTitleCurr.length - 5) //倒数5  scroll view line
                {
                    intent.setClass(MainActivity.this, HLNScrollActivity.class);
                } else if (position >= chartsTitleCurr.length - 6) //倒数6  scroll view bar
                {
                    intent.setClass(MainActivity.this, HBARScrollActivity.class);

                } else if (position >= chartsTitleCurr.length - 7) //倒数6  scroll view bar
                {
                    position = chartsTitleCurr.length - 7 - position;
                    intent.setClass(MainActivity.this, ClickChartsActivity.class);

                } else if (position >= chartsTitleCurr.length - 8) //倒数8  dial chart
                {
                    position = chartsTitleCurr.length - 8 - position;
                    intent.setClass(MainActivity.this, DialChartActivity.class);
                } else if (position >= chartsTitleCurr.length - 9) //倒数9  dial chart
                {
                    position = chartsTitleCurr.length - 9 - position;
                    intent.setClass(MainActivity.this, DialChart2Activity.class);

                } else if (position >= chartsTitleCurr.length - 10) //倒数9  dial chart
                {
                    position = chartsTitleCurr.length - 10 - position;
                    intent.setClass(MainActivity.this, DialChart3Activity.class);
                } else if (position >= chartsTitleCurr.length - 11) //倒数9  dial chart
                {
                    position = chartsTitleCurr.length - 11 - position;
                    intent.setClass(MainActivity.this, DialChart4Activity.class);

                } else if (position >= chartsTitleCurr.length - 12) //倒数9  dial chart
                {
                    position = chartsTitleCurr.length - 12 - position;
                    intent.setClass(MainActivity.this, DySpActivity.class);

                } else {
                    intent.setClass(MainActivity.this, ChartsActivity.class);
                }

				 /*
                 if(position >= chartsTitleCurr.length - 3) //倒数1,2,3 seekbar图
				 {
					 position = chartsTitleCurr.length - 1 - position;
					 intent.setClass(MainActivity.this,SeekBarActivity.class);
				 }else if(position >= chartsTitleCurr.length - 5) ////倒数4,5 同源汇总图
				 {
					 position = chartsTitleCurr.length - 4 - position;
					 intent.setClass(MainActivity.this,SpinnerActivity.class);
				 }else{
					 intent.setClass(MainActivity.this,ChartsActivity.class);
				 }
				 */

                bundleSimple.putInt("selected", position);
                intent.putExtras(bundleSimple);
                startActivity(intent);
            }
        };
        mListView.setOnItemClickListener(listener);
    }

    private List<Map<String, String>> getData() {
        List<Map<String, String>> listData = new ArrayList<Map<String, String>>();

        String chartsTitle[] = getResources().getStringArray(R.array.chartsTitle);
        String chartsDesc[] = getResources().getStringArray(R.array.chartsDesc);

        int count = chartsDesc.length < chartsTitle.length ?
                chartsDesc.length : chartsTitle.length;

        for (int i = 0; i < count; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("title", chartsTitle[i]);
            map.put("description", chartsDesc[i]);
            listData.add(map);
        }
        return listData;
    }
}
