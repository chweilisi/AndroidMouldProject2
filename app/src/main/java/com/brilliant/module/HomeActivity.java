package com.brilliant.module;

import android.os.SystemClock;

import com.blankj.utilcode.util.ToastUtils;
import com.brilliant.R;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIFactory;

public class HomeActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private long mBackPressedTime; // 退出应用相关

    private String download_url = "https://172.16.88.230:8383/apk/ced9ab08-3d7d-4cc7-882d-2d81f72a0976.apk";

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     * 退出登录
     */
    private void userExit() {
        long curTime = SystemClock.uptimeMillis();
        if ((curTime - mBackPressedTime) < (2 * 1000)) {
            finish();
        } else {
            mBackPressedTime = curTime;
            ToastUtils.showShortToast(R.string.app_exit_confirm);
        }
    }

    /**
     * 开启升级
     */
    private void downloadUpdateAPK(String download_url) {
        UIFactory.openDownLoadService(mContext, download_url, "中...");
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onBackPressed() {
        userExit();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        // 下载升级
        // downloadUpdateAPK(download_url);
    }

    @Override
    public void initData() {

    }

    //######################   override methods end  ##############################################
}
