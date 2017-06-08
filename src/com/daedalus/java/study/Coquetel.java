package com.daedalus.java.study;

public class Coquetel {

    public static void main(String[] args) {

        String name1="Coquetel";

        Person myPerson1 = new Person(name1);
        myPerson1.hi();

        String name2="Daedalus";

        Person myPerson2 = new Person(name2);
        myPerson2.hi();

        String name3="";

        Person myPerson3 = new Person(name3);
        myPerson3.hi();

//        String result1 = myPerson.buy(60);
//        System.out.println(result1);
//
//        String result2 = myPerson.buy(40);
//        System.out.println(result2);

//        Utils.hello();
    }
}
