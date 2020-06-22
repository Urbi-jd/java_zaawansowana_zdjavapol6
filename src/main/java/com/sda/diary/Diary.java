package com.sda.diary;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Diary {

    private List<Entry> entries = new ArrayList<>();

    private class Entry {
       LocalDate date;
       String text;
    }
}
