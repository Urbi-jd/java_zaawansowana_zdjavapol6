package com.sda.strings;

public class MyAnomStringOperations {
    public static void main(String[] args) {

        StringOperation addText = new StringOperation() {
            @Override
            public String modify(String text) {
                return "modified " + text;
            }
        };

        System.out.println(addText.modify("some text"));
    }
}
