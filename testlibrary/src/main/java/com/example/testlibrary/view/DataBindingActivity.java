package com.example.testlibrary.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.testlibrary.DataBindingTest;
import com.example.testlibrary.R;
import com.example.testlibrary.bean.Student;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class DataBindingActivity extends Activity {

    //##########################  custom variables start ##########################################


    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingTest binding = DataBindingUtil.setContentView(this, R.layout.testlibrary_activity_databinding);
        binding.setStu(new Student("lee", "Shenzhen"));
        binding.setStr("just do it");
        binding.setNum(10);

    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

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
