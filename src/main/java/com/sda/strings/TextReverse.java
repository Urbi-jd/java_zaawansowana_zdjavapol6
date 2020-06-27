package com.sda.strings;

public class TextReverse implements StringOperation{

    @Override
    public String modify(String text) {
        char [] textChar = text.toCharArray();
        char [ ]reversed = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {
            reversed[i] = textChar[textChar.length - i - 1];
        }
        String output = "";
        for (char chars : reversed) {
            output += chars;
        }
        return output;
    }
}
