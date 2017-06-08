package com.daedalus.java.study;

public class Coquetel {

    public static void main(String[] args) {

        Person myPerson = new Person();

        String result1 = myPerson.buy(60);
        System.out.println(result1);

        String result2 = myPerson.buy(40);
        System.out.println(result2);


        Utils myUtils = new Utils();
        myUtils.hello();

    }
}
