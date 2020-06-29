package com.sda.Examples;

import java.time.LocalDate;
import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {

//        Map<String, Person_Collections> map = new HashMap<>();
//
//        map.put("1", new Person_Collections("Mateusz", "Urbański",
//                LocalDate.now()));
//        map.put("2", new Person_Collections("Michał", "Urbański",
//                LocalDate.of(2001,9,21)));
//
//        System.out.println(map.get("1"));
//
//        Set<Map.Entry<String, Person_Collections>> elements = map.entrySet();
//        for(Map.Entry<String, Person_Collections> element : elements) {
//            String key = element.getKey();
//            Person_Collections value = element.getValue();
//            System.out.println("#" + key + ": " + value);
//        }
//
//        map.put("1", new Person_Collections("Adam", "Bodnar", LocalDate.now()));
//        elements = map.entrySet();
//        for (Map.Entry<String, Person_Collections> element : elements) {
//            String key = element.getKey();
//            Person_Collections value = element.getValue();
//            System.out.println("#" + key + ": " + value);
//        }

//        Set <String> cos = new HashSet<>();
//        cos.add("Ala");
//        cos.add("ma");
//        cos.add("kota");
//        cos.add("Kot");
//        cos.add("ma");
//        cos.add("Alę");

//        Set<String> cos = Set.of("Ala", "ma", "kota", "Kot", "Alę");
//
//        for (String text : cos) {
//            System.out.println(text);
//        }


//        String[] texts = new String[] {"ala", "ma","kota"};
//
////        Arrays.stream(texts)
////                .filter(s -> s.length() > 2)
////                .map(String::toUpperCase)
////                .forEach(System.out.println(texts));
//
//        List<String> listFromArray = Arrays.asList(texts);
//
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

        phoneBook.put("Karol Koltun","1278");
        System.out.println(phoneBook.get("Karol Koltun"));

        System.out.println();

        Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
