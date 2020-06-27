package com.sda.strings;

import java.util.List;

public class AnomStringOperations {
    public static void main(String[] args) {
        TextTruncate tT = new TextTruncate(6);
        TextReverse tR = new TextReverse();

        String text = "Some text";

        System.out.println(tT.modify(text));
        System.out.println(tR.modify(text));
        System.out.println();
        System.out.println("9.3.1");

        TextCensor tC = new TextCensor(List.of("-","shit"));
        System.out.println(tC.modify("That shiTty hoT-dog, taste like shit"));





    }
}
