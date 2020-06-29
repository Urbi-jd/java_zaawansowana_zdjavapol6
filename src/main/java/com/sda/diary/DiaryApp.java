package com.sda.diary;

import java.time.LocalDate;
import java.util.List;

public class DiaryApp {
    public static void main(String[] args) {

    Diary diary = new Diary();
    diary.writeEntry("Pierwszy wpis");
    diary.writeEntry("Drugi wpis");

       List <String> newList = diary.getEntriesFromDiary(LocalDate.now());
       listPrint(newList);



    }

    static void listPrint(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
