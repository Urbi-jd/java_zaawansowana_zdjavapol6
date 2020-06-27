package com.sda.strings;

public class TextTruncate implements StringOperation {
    int length;

    public TextTruncate(int length) {
        this.length = length;
    }

    @Override
    public String modify(String text) {
        String resoult = "";
        char[] tab = text.toCharArray();
        if (tab.length < length) {
            for (int i = 0; i < tab.length; i++) {
                resoult += tab[i];
            }
        } else{
            for (int i = 0; i < length; i++) {
                resoult += tab[i];
            }
        }
        return resoult;
    }
}
