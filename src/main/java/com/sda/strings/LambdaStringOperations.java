package com.sda.strings;

public class LambdaStringOperations {

    public static void main(String[] args) {


        StringOperation toUpperCase = text -> text.toUpperCase();

        System.out.println(toUpperCase.modify("LuKaSz"));

        StringOperation uppercase = String::toUpperCase;
        System.out.println(uppercase.modify("ArTuR"));

        StringOperation lowerCase = String::toLowerCase;
        System.out.println(lowerCase.modify("AgATa"));


        StringOperation myMod = LambdaStringOperations::myModification;
        System.out.println(myMod.modify("dfafdzafafaf"));

    }

    private static String myModification (String text){
        return text + " MODIFIED";
    }
}
