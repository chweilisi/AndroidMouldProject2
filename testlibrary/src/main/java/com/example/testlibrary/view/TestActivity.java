package com.example.testlibrary.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIFactory;
import com.example.baselibrary.widget.dialog.CustomProgressDialog;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;

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
            R2.id.SuperTextView})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.okgo_request) {
            //  okgo 网络请求测试
            UIFactory.startOkGoTestActivity(this, RESULT_OK);
        } else if (i == R.id.sync) {
            // 同步请求
            UIFactory.startSyncActivity(this, RESULT_OK);
        } else if (i == R.id.upload) {
            // 文件上传
            UIFactory.startFormUploadActivity(this, RESULT_OK);
        } else if (i == R.id.download) {
            // 文件下载
            UIFactory.startFileDownloadActivity(this, RESULT_OK);
        } else if (i == R.id.requestPermissionSingle) {
            // 6.0及之后权限申请
            UIFactory.startRequestPermissionSingleActivity(this, RESULT_OK);
        } else if (i == R.id.requestPermissionMultiple) {
            // 6.0及之后权限申请
            UIFactory.startRequestPermissionMultipleActivity(this, RESULT_OK);
        } else if (i == R.id.custtomTitleBar) {
            // 自定义标题栏
            UIFactory.startCusttomTitleBarActivity(this, RESULT_OK);
        } else if (i == R.id.custtomTagsLayout) {
            // 自定义标签云
            UIFactory.startCusttomTagsLayoutActivity(this, RESULT_OK);
        } else if (i == R.id.custtomRatingStar) {
            // 自定义星级评分
            UIFactory.startCusttomRatingStarActivity(this, RESULT_OK);
        } else if (i == R.id.custtomEmpty) {
            // 自定义自定义空白页面，loading页面，错误页面
            UIFactory.startEmptyActivity(this, RESULT_OK);
        } else if (i == R.id.dataBinding) {
            // dataBinding测试
            UIFactory.startDataBindingActivity(this, RESULT_OK);
        } else if (i == R.id.customDialog) {
            // 自定义dialog的两种实现方式
            UIFactory.startCustomDialogActivity(this, RESULT_OK);
        } else if (i == R.id.customPopupWindow) {
            // 自定义扩展性强的popupWindow
            UIFactory.startCustomPopupWindowActivity(this, RESULT_OK);
        } else if (i == R.id.customBanner) {
            // 自定义banner轮播图实现
            UIFactory.startCustomBannerActivity(this, RESULT_OK);
        } else if (i == R.id.loggerdisplay) {
            // logger日志使用展示
            UIFactory.startLogDisplayActivity(this, RESULT_OK);
        } else if (i == R.id.cache) {
            // 缓存处理
            UIFactory.startCacheActivity(this, RESULT_OK);
        } else if (i == R.id.SuperTextView) {
            // SuperTextView
            UIFactory.startSuperTextViewActivity(this, RESULT_OK);
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
