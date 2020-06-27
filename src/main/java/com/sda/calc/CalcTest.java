package com.sda.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.multiplyNumbers(5, 8, 1));
        System.out.println(calc.multiplyNumbers(2, 5));
        System.out.println(calc.multiplyNumbers(5));
    }
}
