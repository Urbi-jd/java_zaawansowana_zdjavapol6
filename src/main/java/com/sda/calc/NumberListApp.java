package com.sda.calc;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class NumberListApp {
    public static void main(String[] args) {

        NumberList<Number> numberList = new NumberList<>();

        numberList.addNumber(2);
        numberList.addNumber(2);
        numberList.addNumber(2L);
        numberList.addNumber(2);
        numberList.addNumber(2);
        numberList.addNumber(2.5);

        System.out.println(numberList.getAvg());
        System.out.println(numberList.getIntSum());

        List<Number> listOfDoubles = List.of(2.0, 2.0, 2.0, 2.0, 2.0, 0.5);

        System.out.println(numberList.hasSameIntSum(listOfDoubles));


    }
}
