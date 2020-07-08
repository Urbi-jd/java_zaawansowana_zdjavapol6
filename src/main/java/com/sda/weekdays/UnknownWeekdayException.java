package com.sda.weekdays;

public class UnknownWeekdayException extends RuntimeException{
String wrongDay;

    public UnknownWeekdayException(String wrongDay) {
        this.wrongDay = wrongDay;
    }
}
