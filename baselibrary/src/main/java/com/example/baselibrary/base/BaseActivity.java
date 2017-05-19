package com.example.baselibrary.base;

import android.os.Bundle;
import android.view.View;

import com.basemodule.base.IBaseActivity;
import com.basemodule.base.IBaseModel;
import com.basemodule.base.IBasePresenter;
import com.example.baselibrary.util.MyToastUtil;

/**
 * add your personal code here
 * Created by conan on 2017/2/20.
 */
public abstract class BaseActivity<T extends IBasePresenter, E extends IBaseModel> extends IBaseActivity<T, E>
        implements PresentationLayerFunc, View.OnClickListener {

    private PresentationLayerFuncHelper presentationLayerFuncHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        presentationLayerFuncHelper = new PresentationLayerFuncHelper(this);
        super.onCreate(savedInstanceState);
        // 设置状态栏颜色
        initWindows(getResources().getColor(android.R.color.holo_green_dark));
    }

    @Override
    public void showProgressDialog() {
        presentationLayerFuncHelper.showProgressDialog();
    }

    @Override
    public void showProgressDialog(String notice) {
        presentationLayerFuncHelper.showProgressDialog(notice);
    }

    @Override
    public void hideProgressDialog() {
        presentationLayerFuncHelper.hideProgressDialog();
    }

    @Override
    public void showLoading() {
        if (!isFinishing()) {
            try {
                showProgressDialog("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showLoading(String notice) {
        if (!isFinishing()) {
            try {
                showProgressDialog(notice);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void hideLoading() {
        hideProgressDialog();
    }

    @Override
    public void showErrorTip(String s) {
        MyToastUtil.showShortToast(s);
    }

    @Override
    public void onClick(View v) {
    }
}
