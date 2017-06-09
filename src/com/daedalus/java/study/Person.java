package com.daedalus.java.study;

/**
 * Created by daedalus on 2017/6/7.
 */

public class Person {

    private String name;

    //类的另外一个构造函数
    public Person() {
        name = "";
    }

    //类的构造函数，传递一个名字
    public Person(String myName) {
        name = myName;
    }


    public void hi() {
        System.out.println("我的名字叫：" + name);
    }

    public String buy(int money) {

        if (money > 50) {
            return "剁手成功";
        } else {
            return "钱不够";
        }
    }
}
