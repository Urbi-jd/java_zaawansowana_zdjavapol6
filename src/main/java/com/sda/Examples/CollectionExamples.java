package com.sda.Examples;

import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        String[] texts = new String[] {"ala", "ma","kota"};

//        Arrays.stream(texts)
//                .filter(s -> s.length() > 2)
//                .map(String::toUpperCase)
//                .forEach(System.out.println(texts));

        List<String> listFromArray = Arrays.asList(texts);

        ArrayList<String> textList = new ArrayList<>();
        textList.add("ala");
        textList.add("ma");
        textList.add("kota");

        for (int i = 0; i < textList.size(); i++) {
            System.out.println(textList.get(i));
        }
        System.out.println();

        for (String text : textList) {
            System.out.println(text.toUpperCase());
        }

        Map<String ,String> phoneBook = new HashMap<>();
        phoneBook.put("Karol Koltun", "1234");
        phoneBook.put("Wiktoria Kamińska", "5678");

        System.out.println(phoneBook.get("Karol Koltun"));

        System.out.println();

        Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
