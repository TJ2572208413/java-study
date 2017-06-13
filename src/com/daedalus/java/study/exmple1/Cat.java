package com.daedalus.java.study.exmple1;

/**
 * Created by daedalus on 2017/6/12.
 */
public class Cat extends Animal {

    public Cat(String myName, String myColor) {
        super(myName, myColor);
    }

    @Override
    public void shout()
    {
        System.out.println( "我的名字叫:"+name+"，我的颜色是:"+color+"，喵喵喵喵");
    }
}
