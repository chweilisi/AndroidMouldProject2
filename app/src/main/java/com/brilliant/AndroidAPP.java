package com.brilliant;

import android.content.Context;

import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.example.baselibrary.base.BaseApplication;
import com.example.baselibrary.constant.APPConstant;
import com.example.baselibrary.constant.APPMethod;
import com.example.baselibrary.widget.dialog.CustomProgressDialog;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * description:
 * Date: 2017/3/21 16:01
 * User: Administrator
 */
@SuppressWarnings("unused")
public class AndroidAPP extends BaseApplication {

    //##########################  custom variables start ##########################################

    private RefWatcher refWatcher;

    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public void onCreate() {
        super.onCreate();
        String processName = APPMethod.getCurProcessName(getApplicationContext());
        if (!StringUtils.isEmpty(processName) && processName.equals(APPConstant.PACKAGE_NAME)) {
            _initConfig();
        }

        //=== 内存泄露检测框架
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        refWatcher = LeakCanary.install(this);
    }

    //######################   override methods end  ##############################################

    //###################### override custom metohds start ########################################

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    public static AndroidAPP getInstance() {
        return (AndroidAPP) getAppInstance();
    }

    /**
     * 初始化配置
     */
    private void _initConfig() {
        if (BuildConfig.DEBUG) {
            //
            setProgressDialog(new CustomProgressDialog(getApplicationContext(), R.style.CustomProgressDialog));
        }
        ToastUtils.init(true);
    }

    /**
     * leakcanary
     *
     * @param context
     * @return
     */
    public static RefWatcher getRefWatcher(Context context) {
        AndroidAPP application = (AndroidAPP) context.getApplicationContext();
        return application.refWatcher;
    }

    //######################    custom metohds end   ##############################################

}