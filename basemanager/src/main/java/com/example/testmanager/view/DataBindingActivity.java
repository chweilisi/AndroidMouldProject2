package com.example.testmanager.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.testmanager.R;
import com.example.testmanager.bean.Student;
import com.example.testmanager.databinding.TestlibraryActivityDatabindingBinding;


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
        TestlibraryActivityDatabindingBinding binding = DataBindingUtil.setContentView(this, R.layout.testlibrary_activity_databinding);
        binding.setStu(new Student("leesd", "Shenzhesdfdn"));
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
