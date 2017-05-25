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

    //##########################  custom variables start ##########################################

    private PresentationLayerFuncHelper presentationLayerFuncHelper;

    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public void onCreate(Bundle savedInstanceState) {
        presentationLayerFuncHelper = new PresentationLayerFuncHelper(this);
        setContentView(getLayoutId());
        super.onCreate(savedInstanceState);
    }

    //######################   override methods end  ##############################################

    //###################### override custom metohds start ########################################

    @Override
    public void showProgressDialog() {
        presentationLayerFuncHelper.showProgressDialog();
    }

    @Override
    public void showProgressDialog(String notice) {
        presentationLayerFuncHelper.showProgressDialog(notice);
    }

    /**
     * 展示个性化的加载框
     *
     * @param cancelAble
     * @param notice
     * @param orientation
     * @param backgroundColor
     * @param messageColor
     */
    @Override
    public void showCustomProgressDialog(boolean cancelAble, String notice, int orientation, int backgroundColor, int messageColor) {
        if (!isFinishing()) {
            try {
                presentationLayerFuncHelper.showCustomProgressDialog(cancelAble, notice, orientation, backgroundColor, messageColor);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

}
