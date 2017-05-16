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

    //#################################################################### 自定义变量 start


    //#################################################################### 自定义变量 end

    //#################################################################### 重写自定义方法 start

    @Override
    public int getLayoutId() {
        return R.layout.test_library_activity_test;
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

    //#################################################################### 重写自定义方法 end

    //#################################################################### 自定义方法 start

    //#################################################################### 自定义方法 end

    //#################################################################### 重写系统方法 start

    @OnClick({R2.id.okgo_request, R2.id.sync, R2.id.upload, R2.id.download, R2.id.requestPermissionSingle,
            R2.id.requestPermissionMultiple})
    public void onClick(View v) {
        int i = v.getId();
        if (i == R2.id.okgo_request) {
            //  okgo 网络请求测试
            UIFactory.startOkGoTestActivity(this, RESULT_OK);
        } else if (i == R2.id.sync) {
            // 同步请求
            UIFactory.startSyncActivity(this, RESULT_OK);
        } else if (i == R2.id.upload) {
            // 文件上传
            UIFactory.startFormUploadActivity(this, RESULT_OK);
        } else if (i == R2.id.download) {
            // 文件下载
            UIFactory.startFileDownloadActivity(this, RESULT_OK);
        } else if (i == R2.id.requestPermissionSingle) {
            //
            UIFactory.startRequestPermissionSingleActivity(this, RESULT_OK);
        } else if (i == R2.id.requestPermissionMultiple) {
            //
            UIFactory.startRequestPermissionMultipleActivity(this, RESULT_OK);
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

    //#################################################################### 重写系统方法 end
}
