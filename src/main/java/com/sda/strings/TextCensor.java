package com.sda.strings;

import java.util.ArrayList;
import java.util.List;

public class TextCensor implements StringOperation {

    List<String> forbiddenWords = new ArrayList<>();

    public TextCensor(List<String> forbiddenWords) {
        this.forbiddenWords = forbiddenWords;
    }

//    @Override
//    public String modify(String text) {
//        String [] words = text.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < forbiddenWords.size(); j++) {
//                if(words[i].contains(forbiddenWords.get(j))){
//                    words[i] = "";
//                }
//            }
//        }
//        String outputText = "";
//        for (String word : words) {
//            outputText = outputText + word + " ";
//        }
//        return outputText;
//    }

    // 9.3.1
//    @Override
//    public String modify(String text) {
//        String output = text;
//        for (int i = 0; i < forbiddenWords.size(); i++) {
//            output = output.replace(forbiddenWords.get(i), "");
//        }
//        return output;
//    }

    // 9.3.2
    @Override
    public String modify(String text) {
        String output = text.charAt(0) + (text.substring(1,text.length())).toLowerCase();
        for (int i = 0; i < forbiddenWords.size(); i++) {
            String replacement = "*";
            output = output.replace(forbiddenWords.get(i),
                    replacement.repeat(forbiddenWords.get(i).length()));
        }
        return text + "\n" + output;
    }

}
