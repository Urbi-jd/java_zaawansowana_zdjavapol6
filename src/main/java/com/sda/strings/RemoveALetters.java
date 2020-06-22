package com.sda.strings;

public class RemoveALetters implements StringOperation{
    public String modify(String text){
        text.replaceAll("a","");

        return text;
    }

}
