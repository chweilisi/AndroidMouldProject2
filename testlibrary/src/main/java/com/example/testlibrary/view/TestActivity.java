package com.example.testlibrary.view;

import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.constant.UIFactory;
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
    public void initData() {
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.okgo_request, R2.id.sync, R2.id.upload, R2.id.download, R2.id.requestPermissionSingle,
            R2.id.requestPermissionMultiple, R2.id.custtomTitleBar, R2.id.custtomTagsLayout})
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
