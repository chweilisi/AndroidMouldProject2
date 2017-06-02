package com.example.testmanager;

import android.app.Activity;
import android.os.Bundle;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.constant.UIFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLogUtil.i("MainActivity--");
        UIFactory.startTestActivity(this, RESULT_OK);
    }
}
