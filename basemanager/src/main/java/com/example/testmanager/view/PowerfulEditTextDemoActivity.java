package com.example.testmanager.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;

import com.example.baselibrary.util.MyToastUtil;
import com.example.baselibrary.widget.PowerfulEditText;
import com.example.testmanager.R;

/**
 * PowfulEditText演示
 */
public class PowerfulEditTextDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testlibrary_activity_powerful_et);

        PowerfulEditText petUsername = (PowerfulEditText) findViewById(R.id.pet);
        petUsername.setOnRightClickListener(new PowerfulEditText.OnRightClickListener() {
            @Override
            public void onClick(EditText editText) {
                String content = editText.getText().toString().trim();
                if (TextUtils.isEmpty(content)) {
                    MyToastUtil.showShortToast("搜索的内容不能为空");
                    return;
                }
                MyToastUtil.showShortToast("执行搜索逻辑");
            }
        });
    }
}
