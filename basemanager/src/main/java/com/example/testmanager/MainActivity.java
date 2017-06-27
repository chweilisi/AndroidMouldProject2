package com.example.testmanager;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIBaseFactory;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private PackageManager mP;

    private ComponentName defAppLauncher;  //默认的应用入口

    private ComponentName customAppLauncher; // 自定义的应用入口

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_main;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        mP = getApplicationContext().getPackageManager();

        defAppLauncher = new ComponentName(getBaseContext(), "com.example.testmanager.TestActivity");
        customAppLauncher = new ComponentName(getBaseContext(), "com.example.testmanager.ChangeAppIconAliasActivity");
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     * @param name
     */
    private void enabledComponent(ComponentName name) {
        mP.setComponentEnabledSetting(name, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    /**
     * @param name
     */
    private void disableComponent(ComponentName name) {
        mP.setComponentEnabledSetting(name, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    /**
     * 使用默认的应用入口
     */
    private void setAppDefLauncher() {
        disableComponent(defAppLauncher); //禁用之前的图标
        enabledComponent(customAppLauncher);
    }

    /**
     * 使用自定义的应用入口
     */
    private void setCustomLauncher() {
        disableComponent(customAppLauncher);
        enabledComponent(defAppLauncher);
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R.id.button_go_test, R.id.button_change_appicon, R.id.button_huifu_appicon})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button_go_test) {
            //
            UIBaseFactory.startTestActivity(this, RESULT_OK);
        } else if (i == R.id.button_change_appicon) {
            //
            setAppDefLauncher();
        } else if (i == R.id.button_huifu_appicon) {
            //
            setCustomLauncher();
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
