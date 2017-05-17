package com.example.testmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.baselibrary.constant.UIFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UIFactory.startTestActivity(this, RESULT_OK);
    }
}
