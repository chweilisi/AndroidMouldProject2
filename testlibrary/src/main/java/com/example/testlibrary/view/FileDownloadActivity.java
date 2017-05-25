package com.example.testlibrary.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.format.Formatter;
import android.widget.Button;
import android.widget.TextView;

import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.api.APIConstant;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.widget.NumberProgressBar;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;
import com.example.testlibrary.api.APIMethod;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.request.BaseRequest;

import java.io.File;
import java.util.HashMap;

import butterknife.BindView;
import okhttp3.Call;
import okhttp3.Response;

public class FileDownloadActivity extends BaseActivity {

    @BindView(R2.id.description)
    TextView description;

    @BindView(R2.id.fileDownload)
    Button btnFileDownload;

    @BindView(R2.id.downloadSize)
    TextView tvDownloadSize;

    @BindView(R2.id.tvProgress)
    TextView tvProgress;

    @BindView(R2.id.netSpeed)
    TextView tvNetSpeed;

    @BindView(R2.id.pbProgress)
    NumberProgressBar pbProgress;

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_file_download;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData(Bundle savedInstanceState) {
        description.setText("1.支持大文件或小文件下载，无论多大文件都不会发生OOM\n" +
                "2.支持监听下载进度和下载网速\n" +
                "3.支持自定义下载目录和下载文件名");
        fileDownload();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Activity销毁时，取消网络请求
        OkGo.getInstance().cancelTag(this);
    }

    /**
     *
     */
    public void fileDownload() {
        //=== 参数设置
        HashMap<String, String> params = new HashMap<>();
        APIMethod.downloadFileWithCallback(FileDownloadActivity.this, APIConstant.URL_DOWNLOAD, params,
                new FileCallback("OkGo.apk") {
                    @Override
                    public void onBefore(BaseRequest request) {
                        btnFileDownload.setText("正在下载中");
                    }

                    @Override
                    public void onSuccess(File file, Call call, Response response) {
                        btnFileDownload.setText("下载完成");
                    }

                    @Override
                    public void downloadProgress(long currentSize, long totalSize, float progress, long networkSpeed) {
                        MyLogUtil.i("downloadProgress -- " + totalSize + "  " + currentSize + "  " + progress + "  " + networkSpeed);

                        String downloadLength = Formatter.formatFileSize(getApplicationContext(), currentSize);
                        String totalLength = Formatter.formatFileSize(getApplicationContext(), totalSize);
                        tvDownloadSize.setText(downloadLength + "/" + totalLength);
                        String netSpeed = Formatter.formatFileSize(getApplicationContext(), networkSpeed);
                        tvNetSpeed.setText(netSpeed + "/S");
                        tvProgress.setText((Math.round(progress * 10000) * 1.0f / 100) + "%");
                        pbProgress.setMax(100);
                        pbProgress.setProgress((int) (progress * 100));
                    }

                    @Override
                    public void onError(Call call, @Nullable Response response, @Nullable Exception e) {
                        super.onError(call, response, e);
                        btnFileDownload.setText("下载出错");
                    }
                });
    }
}