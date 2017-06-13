package com.daedalus.java.study.exmple1;

/**
 * Created by daedalus on 2017/6/12.
 */
public class Dog  extends Animal{

    public Dog(String myName, String myColor) {
        super(myName, myColor);
    }

    @Override
    public void shout()
    {
        System.out.println( "我的名字叫:"+name+"，我的颜色是:"+color+"，汪汪汪汪");
    }

}
