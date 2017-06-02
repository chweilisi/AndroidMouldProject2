package com.example.testmanager;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.constant.UIFactory;

public class MainActivity extends Activity {

    private PackageManager mPm;
    private ComponentName mainComponent;
    private ComponentName laodongjieComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLogUtil.i("MainActivity--");
        UIFactory.startTestActivity(this, RESULT_OK);
    }
}
