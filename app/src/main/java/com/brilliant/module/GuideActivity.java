package com.brilliant.module;

import android.widget.TextView;

import com.basemodule.local.sharedpref.SharedPrefUtils;
import com.brilliant.AndroidAPP;
import com.brilliant.R;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.APPConstant;
import com.example.baselibrary.constant.UIFactory;

import butterknife.BindView;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class GuideActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private boolean mIsSkip = false;

    @BindView(R.id.guide_content)
    TextView guide_content;

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.activity_guide;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        _doSkip();
        guide_content.setText("hello");
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
            //在sp中记录访问过引导页的状态
            SharedPrefUtils.setSharedStringData(APPConstant.PREFS_PREVERSION, AndroidAPP.getPackageInfo().versionName);
            UIFactory.startHomeActivity(this, RESULT_OK);
            //===
            finish();
            overridePendingTransition(R.anim.hold, R.anim.zoom_in_exit);
        }
    }

    /**
     * @Description
     * @author BrillantZhao
     * @date 2015-1-16 下午12:56:28
     */
    private void backPressConform() {
        finish();
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onBackPressed() {
        backPressConform();
    }

    //######################   override methods end  ##############################################
}
