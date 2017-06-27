package com.example.testmanager.model;

import android.content.Context;
import android.graphics.Bitmap;

import com.example.baselibrary.baserx.RxSchedulers;
import com.example.testmanager.api.APIMethod;
import com.example.testmanager.bean.QueryAdvertBean;
import com.example.testmanager.contract.SplashAContract;

import java.io.File;
import java.util.ArrayList;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by Conan on 2017/2/23.
 */

/****************
 * 使用例子
 ****************/
//  BaseAPIMethod.getInstance().errorObservable("失败");
//  BaseAPIMethod.getInstance().demoMethod(mContext, params...).flatMap(Func...).map(Func...).compose(RxSchedulers.<Object>io_main());

public class SplashAModel implements SplashAContract.Model {

    Context mContext;

    @Override
    public void setTag(Context context) {
        mContext = context;
    }

    @Override
    public Observable<QueryAdvertBean.DataBean> queryAdvert() {
        return APIMethod.getInstance().queryAdvert(mContext)
                .map(new Func1<QueryAdvertBean, QueryAdvertBean.DataBean>() {
                    @Override
                    public QueryAdvertBean.DataBean call(QueryAdvertBean queryAdvertBean) {
                        QueryAdvertBean.DataBean bean_new = queryAdvertBean.getData();
                        return bean_new;
                    }
                }).compose(RxSchedulers.<QueryAdvertBean.DataBean>io_main());
    }

    @Override
    public Observable<Bitmap> getBitmap() {
        return APIMethod.getInstance().getBitmap(mContext)
                .map(new Func1<Bitmap, Bitmap>() {
                    @Override
                    public Bitmap call(Bitmap bitmap) {

                        return bitmap;
                    }
                }).compose(RxSchedulers.<Bitmap>io_main());
    }

    @Override
    public Observable<String> uploadFile(ArrayList<File> files) {
        return APIMethod.getInstance().uploadFile(mContext, files)
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String string) {

                        return string;
                    }
                }).compose(RxSchedulers.<String>io_main());
    }

    @Override
    public Observable<File> downloadFile() {
        return APIMethod.getInstance().downloadFile(mContext)
                .map(new Func1<File, File>() {
                    @Override
                    public File call(File file) {

                        return file;
                    }
                }).compose(RxSchedulers.<File>io_main());
    }
}
