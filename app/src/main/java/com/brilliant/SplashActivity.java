package com.brilliant;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.basemodule.local.sharedpref.SharedPrefUtils;
import com.basemodule.utils.RxCountDown;
import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.base.BaseFullScreenActivity;
import com.example.baselibrary.constant.APPConstant;
import com.example.baselibrary.constant.UIFactory;
import com.example.baselibrary.widget.SimpleButton;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Subscriber;
import rx.functions.Action0;


/**
 * 启动页面
 */
public class SplashActivity extends BaseFullScreenActivity  {

    //##########################  custom variables start ##########################################

    @BindView(R.id.splash_layout)
    FrameLayout splash_layout;

    @BindView(R.id.sb_skip)
    SimpleButton mSbSkip;

    private boolean mIsSkip = false;

    private int COUNT_TIME = 3; // 倒计时时间长度

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
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        countDown(COUNT_TIME);
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     * 倒计时展示
     *
     * @param time
     */
    private void countDown(int time) {
        RxCountDown.countdown(time)
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        // 开始计时
                    }
                })
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        // 计时完成
                        doSkip();
                    }

                    @Override
                    public void onError(Throwable e) {
                        // 出错
                        doSkip();
                        MyLogUtil.i(e.toString());
                    }

                    @Override
                    public void onNext(Integer integer) {
                        // 当前计时
                        mSbSkip.setText("跳过 " + integer);
                        MyLogUtil.i("跳过 " + integer);
                    }
                });
    }

    /**
     * 跳过倒计时
     */
    private void doSkip() {
        if (!mIsSkip) {
            mIsSkip = true;
            //跳转到MainActivity，并结束当前的LauncherActivity
            //=== 和本次的软件版本号作对比，用来判断软件是否进行了更新，从而决定是否展示引导页
            if (AndroidAPP.getPackageInfo() != null && !AndroidAPP.getPackageInfo().versionName.equals(
                    SharedPrefUtils.getSharedStringData(APPConstant.PREFS_PREVERSION, "0.0.0"))) {
                Animation fadeOut = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.baselib_fadeout);
                fadeOut.setFillAfter(true);
                findViewById(R.id.splash_Image).startAnimation(fadeOut);
                UIFactory.startGuideActivity(this, RESULT_OK);
            } else {
                // 正常的页面流程
                UIFactory.startHomeActivity(this, RESULT_OK);
            }
            //===
            finish();
            overridePendingTransition(R.anim.hold, R.anim.zoom_in_exit);
        }
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick(R.id.sb_skip)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sb_skip: {
                doSkip();
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        // 不响应后退键
        return;
    }

    //######################   override methods end  ##############################################
}
