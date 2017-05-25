package com.example.baselibrary.base;

import android.os.Bundle;

import com.basemodule.base.IBaseModel;
import com.basemodule.base.IBasePresenter;

/**
 * 适用于启动页和引导页等需要全屏展示的页面(页面布局会向上占据状态栏位置)
 * add your personal code here
 * Created by conan on 2017/2/20.
 */
public abstract class BaseFullScreenActivity<T extends IBasePresenter, E extends IBaseModel> extends BaseActivity<T, E> {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 状态栏浮在全屏的页面上面
        setSystemBarTransparent(this);
    }

    //######################   override methods end  ##############################################

    //###################### override custom metohds start ########################################

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

}
