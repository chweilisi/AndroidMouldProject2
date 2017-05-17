package com.brilliant;

import com.basemodule.local.sharedpref.SharedPrefUtils;
import com.basemodule.widget.SimpleButton;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.APPConstant;
import com.example.baselibrary.constant.UIFactory;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * 启动页面
 */
public class SplashActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    @BindView(R.id.sb_skip)
    SimpleButton mSbSkip;

    private boolean mIsSkip = false;

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        _doSkip();
        Logger.i("hello world ");
        Logger.i("HELLO ");
    }

    @Override
    public void initData() {
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     *
     */
    private void _doSkip() {
        if (!mIsSkip) {
            mIsSkip = true;
            //跳转到MainActivity，并结束当前的LauncherActivity
            //=== 和本次的软件版本号作对比，用来判断软件是否进行了更新，从而决定是否展示引导页
            if (AndroidAPP.getPackageInfo() != null && !AndroidAPP.getPackageInfo().versionName.equals(
                    SharedPrefUtils.getSharedStringData(APPConstant.PREFS_PREVERSION, "0.0.0"))) {
                UIFactory.startGuideActivity(this, RESULT_OK);
            } else {
                // 正常的页面流程
//                 UIFactory.startHomeActivity(this, RESULT_OK);

                // 代码示例--测试
                UIFactory.startTestActivity(this, RESULT_OK);
            }
            //===
            finish();
            overridePendingTransition(R.anim.hold, R.anim.zoom_in_exit);
        }
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick(R.id.sb_skip)
    public void onClick() {
        _doSkip();
    }

    @Override
    public void onBackPressed() {
        // 不响应后退键
        return;
    }

    //######################   override methods end  ##############################################
}
