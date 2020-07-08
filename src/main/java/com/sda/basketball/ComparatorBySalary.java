package com.sda.basketball;

import java.math.BigDecimal;
import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        BigDecimal first = o1.salary;
        BigDecimal secound = o2.salary;
        return first.subtract(secound).intValue();
    }
}
