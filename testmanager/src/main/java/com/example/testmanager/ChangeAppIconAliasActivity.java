package com.example.testmanager;

import android.app.Activity;
import android.os.Bundle;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.constant.UIFactory;

/**
 *
 */
public class ChangeAppIconAliasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLogUtil.i("ChangeAppIconAliasActivity--");
        UIFactory.startTestActivity(this, RESULT_OK);
    }
}
