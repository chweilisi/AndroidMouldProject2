package com.example.testlibrary.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.base.BaseActivity;
import com.example.testlibrary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class LogDisplayActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    String json = "{ \"data\": [ { \"time\": \"2016-04-26 00:21:26\", \"context\": \"到潍坊市【潍坊转运中心】\" }, { \"time\": \"2016-04-25 18:16:34\", \"context\": \"威海市【威海集散仓】，正发往【潍坊转运中心】\" }, { \"time\": \"2016-04-25 18:15:42\", \"context\": \"到威海市【威海集散仓】\" } ], \"phone\": \"400-956-5656\", \"url\": \"http://www.800bestex.com\", \"nu\": \"70186506140478\", \"company\": \"百世汇通\" }";
    String xml = "<index><title>洗车</title><zs>较适宜</zs><tipt>洗车指数</tipt><des>较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。</des><title>旅游</title><zs>适宜</zs><tipt>旅游指数</tipt><des>天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。</des></index>";
    List<String> list = new ArrayList<>();
    Map<String, String> map = new HashMap<>();
    Button button;
    Button button2;
    Button button3;
    Button button5;
    Button button4;
    TextView textView;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_log_display;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button5 = (Button) findViewById(R.id.button5);
        button4 = (Button) findViewById(R.id.button4);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        list.add("list数据 测试一");
        list.add("list数据 测试二");

        map.put("name", "Youth");
        map.put("job", "Android工程师");
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button) {
            MyLogUtil.v("xlog用法展示");
            MyLogUtil.d("xlog用法展示");
            MyLogUtil.e("xlog用法展示");
            MyLogUtil.i("xlog用法展示");
            MyLogUtil.w("xlog用法展示");
            MyLogUtil.wtf("xlog用法展示");
        } else if (i == R.id.button2) {
            MyLogUtil.list(list);
        } else if (i == R.id.button3) {
            MyLogUtil.map(map);
        } else if (i == R.id.button4) {
            MyLogUtil.json(json);
        } else if (i == R.id.button5) {
            MyLogUtil.xml(xml);
        }
        textView.setText(MyLogUtil.getFormatLog());
    }

    @Override
    public void onBackPressed() {
        backPressConform();
    }

    /**
     * @Description
     * @author BrillantZhao
     * @date 2015-1-16 下午12:56:28
     */
    private void backPressConform() {
        finish();
    }

    //######################   override methods end  ##############################################
}
