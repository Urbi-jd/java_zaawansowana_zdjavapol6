package com.sda.Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class interfej_comparable {
    public static void main(String[] args) {
        Integer [] numbers = new Integer[] {10,3,12};
        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[1]);

        List <String> texts = Arrays.asList("Ala", "10", "9", "Ko");


        System.out.println(texts);

        texts.sort(null);
        Collections.sort(texts);

        System.out.println(texts);

    }
}
