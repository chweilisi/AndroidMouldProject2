package com.brilliant.chartmanager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.brilliant.chartlibrary.view.CircleChart01View;
import com.brilliant.chartlibrary.view.CircleChart02View;
import com.brilliant.chartlibrary.view.CircleChart03View;

public class CircleChartActivity extends Activity {

    //半圆
    CircleChart01View halfchart = null;


    //圆
    CircleChart02View chart = null;

    //半圆
    CircleChart03View halfchart2 = null;


    //进度/状态
    TextView process = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_chart);

        this.setTitle("圆/半圆图(Circle Chart)");

        init();

    }

    private void init() {
        halfchart = (CircleChart01View) findViewById(R.id.halfcircle_view);
        chart = (CircleChart02View) findViewById(R.id.circle_view);
        halfchart2 = (CircleChart03View) findViewById(R.id.halfcircle_view2);
        process = (TextView) findViewById(R.id.tv_process);
        SeekBar seekBar = (SeekBar) this.findViewById(R.id.seekBar1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {

                process.setText(Integer.toString(progress));

                halfchart.setPercentage(progress);
                halfchart.chartRender();
                halfchart.invalidate();

                chart.setPercentage(progress);
                chart.chartRender();
                chart.invalidate();

                halfchart2.setPercentage(progress);
                halfchart2.chartRender();
                halfchart2.invalidate();

            }
        });
    }

}
