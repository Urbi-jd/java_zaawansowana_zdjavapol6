package com.sda.diary;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Diary {

    public List<Entry> entries = new ArrayList<>( );

    private class Entry {
       LocalDate date;
       String text;

        public Entry(LocalDate date, String text) {
            this.date = date;
            this.text = text;
        }
    }

    public void writeEntry(String text){
        entries.add(new Entry(LocalDate.now(), text));
    }

    public List<String> getEntriesFromDiary(LocalDate date){
        List<String> listOfEnties = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.date.equals(date)) {
                listOfEnties.add(entry.text);
            }
        }
        return listOfEnties;
    }


}
