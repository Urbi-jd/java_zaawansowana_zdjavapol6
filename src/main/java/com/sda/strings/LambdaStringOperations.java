package com.sda.strings;

public class LambdaStringOperations {
    public static void main(String[] args) {

        StringOperation modifyAdd = text -> text.concat(" ADD");
        StringOperation toUpperCase = text -> text.toUpperCase();
        StringOperation uppercase = String::toUpperCase;


        System.out.println(toUpperCase.modify("Karol"));
        System.out.println(uppercase.modify("Lukasz"));
    }


}
