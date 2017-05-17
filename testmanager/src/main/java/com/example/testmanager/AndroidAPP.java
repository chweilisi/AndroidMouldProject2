package com.example.testmanager;

import com.example.baselibrary.base.BaseApplication;

/**
 * description:
 * Date: 2017/3/21 16:01
 * User: Administrator
 */
@SuppressWarnings("unused")
public class AndroidAPP extends BaseApplication {

    //##########################  custom variables start ##########################################

    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public void onCreate() {
        super.onCreate();
    }

    //######################   override methods end  ##############################################

    //###################### override custom metohds start ########################################

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    public static AndroidAPP getInstance() {
        return (AndroidAPP) getAppInstance();
    }

    //######################    custom metohds end   ##############################################

}