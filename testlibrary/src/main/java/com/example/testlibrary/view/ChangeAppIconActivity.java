package com.example.testlibrary.view;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;

import butterknife.OnClick;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class ChangeAppIconActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private PackageManager mPm;
    private ComponentName mainComponent;
    private ComponentName laodongjieComponent;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_change_appicon;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        initComponent();
        mPm = getApplicationContext().getPackageManager();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     *
     */
    public void changeIcon() {
        setComponentEnable(laodongjieComponent);
        setComponentDisenable(mainComponent);
    }

    /**
     * 初始化组件
     */
    private void initComponent() {
        mainComponent = getComponentName();
        laodongjieComponent = new ComponentName(getBaseContext(), "com.example.testmanager.ChangeAppIconAliasActivity");
    }

    /**
     * 开启
     */
    private void setComponentEnable(ComponentName componentEnable) {
        mPm.setComponentEnabledSetting(componentEnable,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }

    /**
     * 关闭
     */
    private void setComponentDisenable(ComponentName componentEnable) {
        mPm.setComponentEnabledSetting(componentEnable,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.button1})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button1) {
            //
            changeIcon();
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
