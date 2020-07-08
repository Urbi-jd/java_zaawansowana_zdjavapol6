package com.sda.weekdays;

public enum WeekDay {

    MONDAY("poniedziałek", "monday"),
    TUESDAY("wtorek", "tuesday"),
    WEDNESDAY("sroda", "wednesday"),
    THURSDAY("czwartek", "thursday"),
    FRIDAY("piatek", "friday"),
    SATURDAY("sobota", "saturday", true),
    SUNDAY("niedziela", "sunday", true);

    private String plName;
    private String enName;
    private boolean isWeekend;

    public String getPlName() {
        return plName;
    }

    public String getEnName() {
        return enName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    WeekDay(String plName, String enName, boolean isWeekend) {
        this.plName = plName;
        this.enName = enName;
        this.isWeekend = isWeekend;
    }

    WeekDay(String plName, String enName) {
        this.plName = plName;
        this.enName = enName;
        isWeekend = false;
    }


    static WeekDay findByPolishName(String polishName) {
        WeekDay[] tempTab = WeekDay.values();
        boolean isFind = false;

        for (int i = 0; i < tempTab.length; i++) {
            if (tempTab[i].plName.equals(polishName)) {
                System.out.println(polishName);
                isFind = true;
                return tempTab[i];
            }
        }
        if(!isFind){
            throw new UnknownWeekdayException(polishName);
        }
        return null;
    }

    static WeekDay findByEnglishName(String engishName) {
        WeekDay[] tempTab = WeekDay.values();
        boolean isFind = false;

        for (int i = 0; i < tempTab.length; i++) {
            if (tempTab[i].enName.equals(engishName)) {
                System.out.println(engishName);
                isFind = true;
                return tempTab[i];
            }
        }
        if(!isFind){
            throw new UnknownWeekdayException(engishName);
        }
        return null;
    }

}
