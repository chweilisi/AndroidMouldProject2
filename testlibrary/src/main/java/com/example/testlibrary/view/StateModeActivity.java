package com.example.testlibrary.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.statemode.LoginContext;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class StateModeActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    @BindView(R2.id.textView)
    TextView textView;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_statemode;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.button1, R2.id.button2, R2.id.button3, R2.id.button4})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button1) {
            //
            LoginContext.getInstance().pay();
            textView.setText(MyLogUtil.getFormatLog());
        } else if (i == R.id.button2) {
            //
            LoginContext.getInstance().collection();
            textView.setText(MyLogUtil.getFormatLog());
        } else if (i == R.id.button3) {
            //
            LoginContext.getInstance().login();
            textView.setText(MyLogUtil.getFormatLog());
        } else if (i == R.id.button4) {
            //
            LoginContext.getInstance().logout();
            textView.setText(MyLogUtil.getFormatLog());
        }
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
