package com.example.testmanager;

import android.os.Bundle;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIFactory;

/**
 *
 */
public class ChangeAppIconAliasActivity extends BaseActivity {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        MyLogUtil.i("ChangeAppIconAliasActivity--");
        UIFactory.startTestActivity(this, RESULT_OK);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

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
