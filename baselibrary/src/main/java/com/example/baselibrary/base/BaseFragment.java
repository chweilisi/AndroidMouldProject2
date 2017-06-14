package com.example.baselibrary.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.basemodule.base.IBaseFragment;
import com.basemodule.base.IBaseModel;
import com.basemodule.base.IBasePresenter;
import com.example.baselibrary.baserx.RxManager;
import com.example.baselibrary.util.EventBusUtils;
import com.example.baselibrary.util.MyToastUtil;

/**
 * add your personal code here
 * description:
 * Date: 2017/4/6 16:38
 * User: Administrator
 */
public abstract class BaseFragment<T extends IBasePresenter, E extends IBaseModel> extends IBaseFragment<T, E>
        implements PresentationLayerFunc, View.OnClickListener {

    //##########################  custom variables start ##########################################

    private PresentationLayerFuncHelper presentationLayerFuncHelper;

    public RxManager mRxManager;

    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presentationLayerFuncHelper = new PresentationLayerFuncHelper(getActivity());
        mRxManager = new RxManager();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        // eventBus
        EventBusUtils.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // eventBus
        EventBusUtils.unregister(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mRxManager!=null){
            mRxManager.clear();
        }
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
        try {
            presentationLayerFuncHelper.showCustomProgressDialog(cancelAble, notice, orientation, backgroundColor, messageColor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hideProgressDialog() {
        presentationLayerFuncHelper.hideProgressDialog();
    }

    @Override
    public void showLoading() {
        try {
            showProgressDialog("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showLoading(String notice) {
        try {
            showProgressDialog(notice);
        } catch (Exception e) {
            e.printStackTrace();
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
