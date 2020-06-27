package com.sda.calc;

public class Calculator {

    public int multiplyNumbers(int start, int end, int step){
        int number = start;
        int multiply = 1;
        while (number <= end){
            multiply *= number;
            number = number + step;
        }
        return multiply;
    }

    public int multiplyNumbers(int start, int end){
        int number = start;
        int multiply = 1;
        while (number <= end){
            multiply *= number;
            number ++;
        }
        return multiply;
    }

    public int multiplyNumbers(int end){
        int number = 1;
        int multiply = 1;
        while (number <= end){
            multiply *= number;
            number ++;
        }
        return multiply;
    }
}
