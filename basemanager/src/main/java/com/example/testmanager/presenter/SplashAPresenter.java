package com.example.testmanager.presenter;

/**
 * Created by Conan on 2017/2/23.
 */


import android.graphics.Bitmap;

import com.example.baselibrary.baserx.RxSubscriber;
import com.example.testmanager.bean.QueryAdvertBean;
import com.example.testmanager.contract.SplashAContract;

import java.io.File;
import java.util.ArrayList;

/****************
 * 使用例子
 ****************/
//mRxManage.add(mModel.demoMethod(params...).subscribe(new RxSubscriber<Object>(mContext, true) {method...}));
public class SplashAPresenter extends SplashAContract.Presenter {

    @Override
    public void queryAdvert() {
        mRxManage.add(mModel.queryAdvert().subscribe(new RxSubscriber<QueryAdvertBean.DataBean>(mContext, true) {

            @Override
            protected void _onCompleted() {
                super._onCompleted();
            }

            @Override
            protected void _onNext(QueryAdvertBean.DataBean bean) {
                mView.returnQueryAdvert(bean);
            }

            @Override
            protected void _onError(String message) {
            }
        }));
    }

    @Override
    public void getBitmap() {
        mRxManage.add(mModel.getBitmap().subscribe(new RxSubscriber<Bitmap>(mContext, true) {

            @Override
            protected void _onCompleted() {
                super._onCompleted();
            }

            @Override
            protected void _onNext(Bitmap bean) {
                mView.returnBitmap(bean);
            }

            @Override
            protected void _onError(String message) {
            }
        }));
    }

    @Override
    public void uploadFile(ArrayList<File> files) {
        mRxManage.add(mModel.uploadFile(files).subscribe(new RxSubscriber<String>(mContext, true) {

            @Override
            protected void _onCompleted() {
                super._onCompleted();
            }

            @Override
            protected void _onNext(String string) {
                mView.returnUploadFile(string);
            }

            @Override
            protected void _onError(String message) {
            }
        }));
    }

    @Override
    public void downloadFile() {
        mRxManage.add(mModel.downloadFile().subscribe(new RxSubscriber<File>(mContext, true) {

            @Override
            protected void _onCompleted() {
                super._onCompleted();
            }

            @Override
            protected void _onNext(File file) {
                mView.returnDownloadFile(file);
            }

            @Override
            protected void _onError(String message) {
            }
        }));
    }
}
