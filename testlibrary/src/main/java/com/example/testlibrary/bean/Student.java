package com.example.testlibrary.bean;

/**
 * description:
 * Date: 2017/5/22 15:36
 * User: Administrator
 */
public class Student {

    private String name;

    private int age;

    private boolean  isMan;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
