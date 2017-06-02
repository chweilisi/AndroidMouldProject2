package com.example.baselibrary.demo;

import android.os.Bundle;

import com.example.baselibrary.R;
import com.example.baselibrary.base.BaseActivity;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class ModelActivity extends BaseActivity {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.baselib_activity_model;
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
