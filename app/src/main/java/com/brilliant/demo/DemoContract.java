package com.brilliant.demo;


import com.example.baselibrary.base.BaseModel;
import com.example.baselibrary.base.BasePresenter;
import com.example.baselibrary.base.BaseView;

/**
 * MVP中Contract
 * Created by Conan on 2017/2/23.
 */
public interface DemoContract {

    abstract class Presenter extends BasePresenter<View, Model> {
        //        public abstract void demoMethod (Object params...);
    }

    interface Model extends BaseModel {
        //        Observable<String> demoMethod(Object params...);

    }

    interface View extends BaseView {
        //        void returnDemoMethod(Object params...);
    }

}
