package com.sda.strings;

public class StringOperationApp {
    public static void main(String[] args) {
        StringOperation stringOperation = new TextUpperCase();


        String before = "karol";
        String afterUpperCase = stringOperation.modify(before);
        System.out.println(
                String.format("Before: %s; after: %s", before, afterUpperCase)
        );
        printBeforeAndAfter(before, stringOperation);
        printBeforeAndAfter("Artur", new TextDuplicate());


        TextDuplicate tD = new TextDuplicate();
        String afterDuplicate = tD.modify(before);
        System.out.println(
                String.format("Before: %s; after: %s", before, afterDuplicate)
        );

        RemoveALetters rAL = new RemoveALetters();
        String afterRemoveALetters = rAL.modify(before);
        System.out.println(
                String.format("Before: %s; after: %s", before, afterRemoveALetters)
        );

        StringOperation toUpper =  text -> text.toUpperCase();
        System.out.println(toUpper.modify(before));

        StringOperation toLower = text -> text.toLowerCase();
        System.out.println(toLower.modify("ARtur"));


    }

    static void printBeforeAndAfter(String before, StringOperation operation){
        System.out.println(
                String.format("Before: %s; after: %s", before, operation.modify(before))
        );
    };

}
