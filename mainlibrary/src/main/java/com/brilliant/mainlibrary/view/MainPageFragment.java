package com.brilliant.mainlibrary.view;

import android.os.Bundle;

import com.basemodule.utils.log.MyLogUtil;
import com.brilliant.mainlibrary.R;
import com.example.baselibrary.base.BaseFragment;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class MainPageFragment extends BaseFragment {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    protected int getLayoutResource() {
        return R.layout.mainlibrary_fragment_mainpage;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    protected void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        if (isVisible) {
            //fragment 可见
            MyLogUtil.d("fragment 可见");
        } else {
            //fragment 不可见
            MyLogUtil.d("fragment 不可见");
        }
    }

    @Override
    protected void onFragmentFirstVisible() {
        // fragment首次可见
        MyLogUtil.d("fragment首次可见");
    }

    //######################  Override custom metohds end  ########################################

    //######################   custom metohds start  ##############################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    //######################   override methods end  ##############################################
}
