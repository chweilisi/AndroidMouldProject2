package com.example.testlibrary.view;

import android.app.Activity;
import android.os.Bundle;

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
//        DataBindingTest binding = DataBindingUtil.setContentView(this, R.layout.testlibrary_activity_databinding);
//
//        Student student = new Student();
//        student.setName("lee");
//        student.setAge(100);
//        student.setMan(true);
//        binding.setStu(student);
//
//        binding.setStr("just do it");
//        binding.setError(true);
//        binding.setNum(10);
//
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("list1");
//        list.add("list2");
//        binding.setList(list);
//        binding.setListKey(0);
//
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("name", "liu");
//        map.put("sex", "male");
//        binding.setMap(map);
//        binding.setMapKey("sex");
//
//        String[] array = new String[2];
//        array[0] = "array0";
//        array[1] = "array1";
//        binding.setArray(array);
//        binding.setArrayKey(1);
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
