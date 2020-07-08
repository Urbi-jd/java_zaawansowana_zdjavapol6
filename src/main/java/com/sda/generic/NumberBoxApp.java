package com.sda.generic;

public class NumberBoxApp {
    public static void main(String[] args) {

        NumberBox <Double> numberBox1 = new NumberBox<>();
        numberBox1.setT(128.4);
        NumberBox <Integer> numberBox2 = new NumberBox<>();
        numberBox2.setT(145);
        NumberBox <Double> numberBox3 = new NumberBox<>();
        numberBox3.setT(145.);
        numberBox3.setT(145.12);

        System.out.println(numberBox2.hasSameValue(numberBox3));
    }
}
