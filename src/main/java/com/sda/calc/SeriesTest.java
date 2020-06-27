package com.sda.calc;

public class SeriesTest {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        byTwos.setStart(1);
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        byTwos.reset();
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
    }
}
