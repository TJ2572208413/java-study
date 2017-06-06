package com.daedalus.java.study;

public class Coquetel {

    public static void main(String[] args) {

        String result1 = buy(60);
        System.out.println(result1);

        String result2 = buy(40);
        System.out.println(result2);
    }

    public static void hello() {

        System.out.println("Hello World");
    }

    public static String buy(int money) {

        if (money > 50) {
            return "剁手成功";
        } else {
            return "钱不够";
        }
    }
}
