package com.sda.generic;

public class BoxApp {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setT("Hello World");
        System.out.println(stringBox.getT());

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(1245);
        System.out.println(integerBox.getT());

        // Raw type UNIKAJ. Tak się nie robi bo jest ryzykowne
        Box box = new Box();
        box.setT("Siema !!");
        System.out.println(box.getT());
        String text = (String) box.getT();
        System.out.println(text.length());
        System.out.println(text);


    }
    public static  <T> void genericMethod(T argument) {
        System.out.println("Got argument of class: " + argument.getClass().getCanonicalName());
    }
}
