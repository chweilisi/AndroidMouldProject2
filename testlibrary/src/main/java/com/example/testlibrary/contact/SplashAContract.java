package com.example.testlibrary.contact;

import android.graphics.Bitmap;

import com.example.baselibrary.base.BaseModel;
import com.example.baselibrary.base.BasePresenter;
import com.example.baselibrary.base.BaseView;
import com.example.testlibrary.bean.QueryAdvertBean;

import java.io.File;
import java.util.ArrayList;

import rx.Observable;

/**
 * Created by Conan on 2017/2/23.
 */
public interface SplashAContract {

    abstract class Presenter extends BasePresenter<View, Model> {

        public abstract void queryAdvert();

        public abstract void getBitmap();

        public abstract void uploadFile(ArrayList<File> files);

        public abstract void downloadFile();

    }

    interface Model extends BaseModel {

        Observable<QueryAdvertBean.DataBean> queryAdvert();

        Observable<Bitmap> getBitmap();

        Observable<String> uploadFile(ArrayList<File> files);

        Observable<File> downloadFile();
    }

    interface View extends BaseView {

        void returnQueryAdvert(QueryAdvertBean.DataBean bean);

        void returnBitmap(Bitmap bitmap);

        void returnUploadFile(String string);

        void returnDownloadFile(File file);

    }

}
