package com.example.testmanager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIBaseFactory;
import com.example.baselibrary.widget.dialog.CustomProgressDialog;

import butterknife.OnClick;

/**
 * activity模板，所有新建的activity都应该复制该文件然后自定义
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class TestActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_test;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        // 展示高度个性化的加载框
        showCustomProgressDialog(true, "hello notice", CustomProgressDialog.VERTICAL, Color.parseColor("#aa000000"), Color.WHITE);
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.okgo_request, R2.id.sync, R2.id.upload, R2.id.download, R2.id.requestPermissionSingle,
            R2.id.requestPermissionMultiple, R2.id.custtomTitleBar, R2.id.custtomTagsLayout,
            R2.id.custtomRatingStar, R2.id.custtomEmpty, R2.id.dataBinding, R2.id.customDialog,
            R2.id.customBanner, R2.id.loggerdisplay, R2.id.cache, R2.id.customPopupWindow,
            R2.id.SuperTextView, R2.id.LcLableView, R2.id.statemode, R2.id.changeappview,
            R2.id.PowerfulEditText, R2.id.ExpandableTextView, R2.id.RunningTextView, R2.id.listviewDefBottom,
            R2.id.listviewCustomBottom, R2.id.customButton, R2.id.startModeChange})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.okgo_request) {
            //  okgo 网络请求测试
            UIBaseFactory.startOkGoTestActivity(this, RESULT_OK);
        } else if (i == R.id.sync) {
            // 同步请求
            UIBaseFactory.startSyncActivity(this, RESULT_OK);
        } else if (i == R.id.upload) {
            // 文件上传
            UIBaseFactory.startFormUploadActivity(this, RESULT_OK);
        } else if (i == R.id.download) {
            // 文件下载
            UIBaseFactory.startFileDownloadActivity(this, RESULT_OK);
        } else if (i == R.id.requestPermissionSingle) {
            // 6.0及之后权限申请
            UIBaseFactory.startRequestPermissionSingleActivity(this, RESULT_OK);
        } else if (i == R.id.requestPermissionMultiple) {
            // 6.0及之后权限申请
            UIBaseFactory.startRequestPermissionMultipleActivity(this, RESULT_OK);
        } else if (i == R.id.custtomTitleBar) {
            // 自定义标题栏
            UIBaseFactory.startCusttomTitleBarActivity(this, RESULT_OK);
        } else if (i == R.id.custtomTagsLayout) {
            // 自定义标签云
            UIBaseFactory.startCusttomTagsLayoutActivity(this, RESULT_OK);
        } else if (i == R.id.custtomRatingStar) {
            // 自定义星级评分
            UIBaseFactory.startCusttomRatingStarActivity(this, RESULT_OK);
        } else if (i == R.id.custtomEmpty) {
            // 自定义自定义空白页面，loading页面，错误页面
            UIBaseFactory.startEmptyActivity(this, RESULT_OK);
        } else if (i == R.id.dataBinding) {
            // dataBinding测试
            UIBaseFactory.startDataBindingActivity(this, RESULT_OK);
        } else if (i == R.id.customDialog) {
            // 自定义dialog的两种实现方式
            UIBaseFactory.startCustomDialogActivity(this, RESULT_OK);
        } else if (i == R.id.customPopupWindow) {
            // 自定义扩展性强的popupWindow
            UIBaseFactory.startCustomPopupWindowActivity(this, RESULT_OK);
        } else if (i == R.id.customBanner) {
            // 自定义banner轮播图实现
            UIBaseFactory.startCustomBannerActivity(this, RESULT_OK);
        } else if (i == R.id.loggerdisplay) {
            // logger日志使用展示
            UIBaseFactory.startLogDisplayActivity(this, RESULT_OK);
        } else if (i == R.id.cache) {
            // 缓存处理
            UIBaseFactory.startCacheActivity(this, RESULT_OK);
        } else if (i == R.id.SuperTextView) {
            // SuperTextView
            UIBaseFactory.startSuperTextViewActivity(this, RESULT_OK);
        } else if (i == R.id.PowerfulEditText) {
            // PowerfulEditText
            UIBaseFactory.startPowerfulEditTextDemoActivity(this, RESULT_OK);
        } else if (i == R.id.ExpandableTextView) {
            // ExpandableTextView
            UIBaseFactory.startExpandableTextViewDemoActivity(this, RESULT_OK);
        } else if (i == R.id.RunningTextView) {
            // RunningTextView
            UIBaseFactory.startRunningTextViewDemoActivity(this, RESULT_OK);
        } else if (i == R.id.listviewDefBottom) {
            // listviewDefBottom
            UIBaseFactory.startEllDefaultBottomDemoActivity(this, RESULT_OK);
        } else if (i == R.id.listviewCustomBottom) {
            // listviewCustomBottom
            UIBaseFactory.startEllCustomBottomDemoActivity(this, RESULT_OK);
        } else if (i == R.id.LcLableView) {
            // 一个简单实用的标签控件,轻松添加最新最热等标签
            UIBaseFactory.startLcLableViewActivity(this, RESULT_OK);
        } else if (i == R.id.statemode) {
            // 从 “状态模式” 解析App登录功能实战技巧
            UIBaseFactory.startStateModeActivity(this, RESULT_OK);
        } else if (i == R.id.changeappview) {
            // 实现应用内View动态更新
            UIBaseFactory.startViewAsycChangeActivity(this, RESULT_OK);
        } else if (i == R.id.customButton) {
            // 自定义button样式
            UIBaseFactory.startCustomButtonActivity(this, RESULT_OK);
        } else if (i == R.id.startModeChange) {
            // 夜间模式切换
            UIBaseFactory.startDayNightActivity(this, RESULT_OK);
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
