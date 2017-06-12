package com.brilliant.mainmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.brilliant.mainlibrary.view.MainPageFragment;
import com.example.baselibrary.base.BaseActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private static final String CURR_INDEX = "currIndex";

    private FragmentManager fragmentManager;

    private static int currIndex = 0;

    private ArrayList<String> fragmentTags;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        fragmentTags = new ArrayList<>(Arrays.asList("HomeFragment"));
        currIndex = 0;
        if (savedInstanceState != null) {
            currIndex = savedInstanceState.getInt(CURR_INDEX);
            hideSavedFragment();
        }

        showFragment();
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     *
     */
    private void hideSavedFragment() {
        Fragment fragment = fragmentManager.findFragmentByTag(fragmentTags.get(currIndex));
        if (fragment != null) {
            fragmentManager.beginTransaction().hide(fragment).commit();
        }
    }

    /**
     *
     */
    private void showFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentByTag(fragmentTags.get(currIndex));
        if (fragment == null) {
            fragment = instantFragment(currIndex);
        }
        for (int i = 0; i < fragmentTags.size(); i++) {
            Fragment f = fragmentManager.findFragmentByTag(fragmentTags.get(i));
            if (f != null && f.isAdded()) {
                fragmentTransaction.hide(f);
            }
        }
        if (fragment.isAdded()) {
            fragmentTransaction.show(fragment);
        } else {
            fragmentTransaction.add(R.id.fragment_container, fragment, fragmentTags.get(currIndex));
        }
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    /**
     * @param currIndex
     * @return
     */
    private Fragment instantFragment(int currIndex) {
        switch (currIndex) {
            case 0:
                return new MainPageFragment();
            default:
                return null;
        }
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onBackPressed() {
        backPressConform();
    }

    /**
     * @Description
     * @author BrillantZhao
     * @date 2015-1-16 下午12:56:28
     */
    private void backPressConform() {
        finish();
    }

    //######################   override methods end  ##############################################
}
