package com.sda.generic;

public class BoxApp {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setT("Hello");

        System.out.println(box1.getT());

        Box<Double> box2 = new Box<>();
        box2.setT(212.46);
        System.out.println(box2.getT());

        Box box3 = new Box();
        box3.setT("jakiś text");
        System.out.println(box3.getT());

        String text = (String) box3.getT();
        System.out.println(text);

        box1.exampleGenricMethod(124);
        box1.exampleGenricMethod(124.89);
        box1.exampleGenricMethod(box2);
        genericMethod("Siema");




    }
    public static <T> void genericMethod(T argument){
        System.out.println(argument.toString());

    }
}
