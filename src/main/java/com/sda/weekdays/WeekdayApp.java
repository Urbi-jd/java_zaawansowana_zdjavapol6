package com.sda.weekdays;

import java.util.Scanner;

public class WeekdayApp {
    public static void main(String[] args) {


        checkUserDay();


    }

    static void checkUserDay() {
        Scanner sc = new Scanner(System.in);

        boolean isException = true;

        do {
            System.out.println("Podaj nazwę dnia");
            String userDay = sc.nextLine();

            try {
                WeekDay.findByPolishName(userDay);
            } catch (UnknownWeekdayException e) {
                isException = false;
                System.err.println("Nie polska nazwa dnia: " + e.wrongDay);
            }

            if (!isException) {
                try {
                    WeekDay.findByEnglishName(userDay);
                    isException = true;
                } catch (UnknownWeekdayException e) {

                    System.err.println("Nie angielska nazwa dnia: " + e.wrongDay);
                }
            }
        } while (!isException);

    }
}
