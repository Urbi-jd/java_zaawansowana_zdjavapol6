package com.sda.strings;

import java.util.List;

public class AnomStringOperations {
    public static void main(String[] args) {

        StringOperation truncateText = new StringOperation() {

            @Override
            public String modify(String text) {
                if(text.length() < 5){
                    return text;
                }
                return text.substring(0,4);
            }
        };

        System.out.println(truncateText.modify("Ala"));
        System.out.println(truncateText.modify("Ala ma kota"));



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
