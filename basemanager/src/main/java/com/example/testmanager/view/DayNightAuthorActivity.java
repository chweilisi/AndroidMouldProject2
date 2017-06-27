package com.example.testmanager.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.testmanager.R;
import com.example.testmanager.helper.DayNightHelper;


public class DayNightAuthorActivity extends AppCompatActivity {

    private DayNightHelper mDayNightHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initTheme();
        setContentView(R.layout.activity_daynight_author);
    }

    private void initData() {
        mDayNightHelper = new DayNightHelper(this);
    }

    private void initTheme() {
        if (mDayNightHelper.isDay()) {
            setTheme(R.style.DayTheme);
        } else {
            setTheme(R.style.NightTheme);
        }
    }
}
