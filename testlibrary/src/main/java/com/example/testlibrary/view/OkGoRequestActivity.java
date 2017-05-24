package com.example.testlibrary.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.basemodule.utils.JsonConvertHelper;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.widget.NumberProgressBar;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;
import com.example.testlibrary.bean.QueryAdvertBean;
import com.example.testlibrary.contact.SplashAContract;
import com.example.testlibrary.model.SplashAModel;
import com.example.testlibrary.presenter.SplashAPresenter;
import com.orhanobut.logger.Logger;
import com.vincent.filepicker.Constant;
import com.vincent.filepicker.activity.ImagePickActivity;
import com.vincent.filepicker.filter.entity.ImageFile;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * description:
 * Date: 2017/4/6 10:50
 * User: Administrator
 */
public class OkGoRequestActivity extends BaseActivity<SplashAPresenter, SplashAModel> implements SplashAContract.View {

    //##########################  custom variables start ##########################################

    //===1.
    @BindView(R2.id.title)
    TextView title;

    //===2.
    @BindView(R2.id.imageView)
    ImageView imageView;

    //===3.
    @BindView(R2.id.formUpload)
    Button btnFormUpload;

    @BindView(R2.id.downloadSize)
    TextView tvDownloadSize;

    @BindView(R2.id.tvProgress)
    TextView tvProgress;

    @BindView(R2.id.netSpeed)
    TextView tvNetSpeed;

    @BindView(R2.id.pbProgress)
    NumberProgressBar pbProgress;

    @BindView(R2.id.images)
    TextView tvImages;

    private ArrayList<ImageFile> imageItems;

    //===4.
    @BindView(R2.id.fileDownload)
    Button btnFileDownload;

    @BindView(R2.id.download_downloadSize)
    TextView tvdownload_DownloadSize;

    @BindView(R2.id.download_tvProgress)
    TextView tvdownload_Progress;

    @BindView(R2.id.download_netSpeed)
    TextView tvdownload_NetSpeed;

    @BindView(R2.id.download_pbProgress)
    NumberProgressBar pbdownload_Progress;

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_okgo_post;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {
        //===
        mPresenter.queryAdvert(); //异步获取广告信息
        mPresenter.getBitmap();   // 获取图片
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //获取到广告信息
    @Override
    public void returnQueryAdvert(QueryAdvertBean.DataBean bean) {
        title.setText(JsonConvertHelper.toJson(bean));
    }

    @Override
    public void returnBitmap(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    @Override
    public void returnUploadFile(String string) {
        btnFormUpload.setText("上传完成");
        Logger.i(string);
    }

    @Override
    public void returnDownloadFile(File file) {
        btnFileDownload.setText("下载完成");
        Logger.i(file.getAbsolutePath());
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.selectImage, R2.id.formUpload, R2.id.fileDownload})
    @Override
    public void onClick(View v) {
        int i1 = v.getId();
        if (i1 == R.id.selectImage) {// 选择图片
            ImagePickActivity.start(OkGoRequestActivity.this, 5, ImagePickActivity.MODE_MULTIPLE,
                    true, true, false, ImagePickActivity.REQUEST_IMAGE);
        } else if (i1 == R.id.formUpload) {// 上传图片
            ArrayList<File> files = new ArrayList<>();
            if (imageItems != null && imageItems.size() > 0) {
                for (int i = 0; i < imageItems.size(); i++) {
                    files.add(new File(imageItems.get(i).getPath()));
                }
            }
            mPresenter.uploadFile(files);
        } else if (i1 == R.id.fileDownload) {// 文件下载
            mPresenter.downloadFile();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == ImagePickActivity.REQUEST_IMAGE) {
            imageItems = data.getParcelableArrayListExtra(Constant.RESULT_PICK_IMAGE);
            if (imageItems != null && imageItems.size() > 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < imageItems.size(); i++) {
                    if (i == imageItems.size() - 1)
                        sb.append("图片").append(i + 1).append(" ： ").append(imageItems.get(i).getPath());
                    else
                        sb.append("图片").append(i + 1).append(" ： ").append(imageItems.get(i).getPath()).append("\n");
                }
                tvImages.setText(sb.toString());
            } else {
                tvImages.setText("--");
            }
        }
    }

    //######################   override methods end  ##############################################
}
