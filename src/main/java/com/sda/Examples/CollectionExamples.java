package com.sda.Examples;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static java.time.LocalDate.*;
import static java.time.Month.*;

public class CollectionExamples {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Ala");
        set1.add("ma");
        set1.add("kota");
        Set<String> set2 = Set.of("A","D", "B", "C");

        for (String text : set1) {
            System.out.println(text);
        }
        set1.remove("Ala");
        System.out.println();

        for (String text : set2) {
            System.out.print(text);
        }

        System.out.println();

        List<String> list = List.of("A", "D", "B", "C");

        for (String text : list) {
            System.out.print(text);
        }

        System.out.println(list.get(2));

        Map<String, String> map = new HashMap<>();

        map.put("Lukasz", "Urbanski");
        System.out.println(map.get("Lukasz"));
        map.put("Lukasz", "Belka");
        System.out.println(map.get("Lukasz"));
        map.put("Agata", "Urbanska");

        Set<Map.Entry<String, String>> elements1 = map.entrySet();
        for(Map.Entry<String, String> element : elements1) {
            String key = element.getKey();
            String value = element.getValue();
            System.out.println("#" + key + " " + value);
        }

        System.out.println("--------------------");


        Map <String, Person> map2 = new HashMap<>();

        map2.put("1", new Person("Mateusz", "Urbański", now(), 164));
        Person person = new Person("Michal", "Urbanski", LocalDate.of(1992, NOVEMBER,11), 158);
        map2.put("2", person);

        Set<Map.Entry<String, Person>> elements = map2.entrySet();
        for(Map.Entry<String, Person> element : elements) {
            String key = element.getKey();
            Person value = element.getValue();
            System.out.println("#" + key + ": " + value);
        }






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
//        ArrayList<String> textList = new ArrayList<>();
//        textList.add("ala");
//        textList.add("ma");
//        textList.add("kota");
//
//        for (int i = 0; i < textList.size(); i++) {
//            System.out.println(textList.get(i));
//        }
//        System.out.println();
//
//        for (String text : textList) {
//            System.out.println(text.toUpperCase());
//        }
//
//
//
//        Map<String ,String> phoneBook = new HashMap<>();
//        phoneBook.put("Karol Koltun", "1234");
//        phoneBook.put("Wiktoria Kamińska", "5678");
//
//
//        System.out.println(phoneBook.get("Karol Koltun"));
//
//        phoneBook.put("Karol Koltun","1278");
//        System.out.println(phoneBook.get("Karol Koltun"));
//
//        System.out.println();
//
//        Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }



    }
}
