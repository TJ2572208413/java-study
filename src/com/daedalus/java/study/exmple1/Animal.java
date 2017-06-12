package com.daedalus.java.study.exmple1;

/**
 * Created by daedalus on 2017/6/12.
 */
public abstract class Animal {

    protected String color;

    protected String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout()
    {
        System.out.println("抽象类的shout方法，需要被子类复写");
    }
}
