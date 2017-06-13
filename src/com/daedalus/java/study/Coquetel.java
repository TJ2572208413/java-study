package com.daedalus.java.study;

import com.daedalus.java.study.exmple1.*;

import java.util.Scanner;

public class Coquetel {

    public static void main(String[] args) {

        Animal myAnimal = new Cat("咪咪", "黄色");
        myAnimal.shout();

        myAnimal = new Dog("小白", "白色");
        myAnimal.shout();

        //String name1 = "Coquetel";

        //Person myPerson1 = new Person(name1);
        //myPerson1.hi();

        //String name2 = "Daedalus";
        //Person myPerson2 = new Person();
        //myPerson2.setName(name2);
        //myPerson2.hi();


        //Utils.hello();
    }

    public static void add() {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        Integer s1 = reader.nextInt();
        System.out.println("你输入的是：" + s1);

        System.out.println("输入第二个数字：");
        Integer s2 = reader.nextInt();
        System.out.println("你输入的是：" + s2);

        Integer result = s1 + s2;

        System.out.println(s1 + " + " + s2 + " 的结果为：" + result);
    }
}
