package com.brilliant.chartmanager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.brilliant.chartlibrary.view.GaugeChart01View;

public class GaugeChartActivity extends Activity {

    //圆
    GaugeChart01View chart = null;
    //进度/状态
    TextView process = null;
    SeekBar seekBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauge_chart);

        this.setTitle("仪表盘(Gauge Chart)");

        init();

    }

    private void init() {
        chart = (GaugeChart01View) findViewById(R.id.chart_view);
        process = (TextView) findViewById(R.id.tv_process);
        seekBar = (SeekBar) this.findViewById(R.id.seekBar1);
        seekBar.setMax(180);

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

                chart.setAngle(progress);
                chart.chartRender();
                chart.invalidate();
            }
        });
    }

}
