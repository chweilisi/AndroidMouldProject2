package com.example.baselibrary.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.basemodule.base.IBaseFragment;
import com.basemodule.base.IBaseModel;
import com.basemodule.base.IBasePresenter;

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

    //##########################   custom variables end  ##########################################

    //######################  override methods start ##############################################

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        presentationLayerFuncHelper = new PresentationLayerFuncHelper(getActivity());
        return super.rootView;
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

    @Override
    public void hideProgressDialog() {
        presentationLayerFuncHelper.hideProgressDialog();
    }

    @Override
    public void onClick(View v) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################
}
