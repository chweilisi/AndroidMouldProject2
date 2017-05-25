package com.example.testmanager;

import android.app.Activity;
import android.os.Bundle;

import com.example.baselibrary.constant.UIFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIFactory.startTestActivity(this, RESULT_OK);
    }
}
