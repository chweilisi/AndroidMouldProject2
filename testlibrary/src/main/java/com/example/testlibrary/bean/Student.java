package com.example.testlibrary.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * description:
 * Date: 2017/5/22 15:36
 * User: Administrator
 */
public class Student {

    public ObservableField<String> name;

    public ObservableField<String> addr;

    public ObservableInt age = new ObservableInt();

    public ObservableBoolean isMan = new ObservableBoolean();

}
