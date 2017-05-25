package com.example.baselibrary.base;

import android.os.Bundle;

import com.basemodule.base.IBaseModel;
import com.basemodule.base.IBasePresenter;

/**
 * 适用于自定义状态栏颜色，同时不影响页面布局的页面(页面布局不会向上占据状态栏位置)
 * add your personal code here
 * Created by conan on 2017/2/20.
 */
public abstract class BaseColorStatusActivity<T extends IBasePresenter, E extends IBaseModel> extends BaseActivity<T, E> {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置状态栏颜色
        initWindows(getResources().getColor(android.R.color.holo_green_dark));
    }

    //######################   override methods end  ##############################################

    //###################### override custom metohds start ########################################

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

}
