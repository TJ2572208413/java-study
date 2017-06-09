package com.daedalus.java.study;

public class Coquetel {

    public static void main(String[] args) {

        String name1 = "Coquetel";

        Person myPerson1 = new Person(name1);
        myPerson1.hi();

        String name2 = "Daedalus";
        Person myPerson2 = new Person();
        //myPerson2.setName(name2);
        myPerson2.hi();


        //Utils.hello();
    }
}
