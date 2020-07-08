package com.sda.calc;

import java.util.Scanner;

public class MathUtils{


    public static <N extends Number> double getSum (N number){

        int sum = 0;
        for (int i = 0; i < number.doubleValue(); i++) {
            sum += i;
        }
        return sum;
    }

    public static <N extends Number> double getFraction (N number){
        int calkowite = number.intValue();
        return number.doubleValue() - calkowite;
    }



    static int parseNumber() throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        String inputNumber = sc.nextLine();
        return Integer.parseInt(inputNumber);
    }

    public static void main(String[] args) {

        System.out.println(getSum(5.1));
        System.out.println(getFraction(5.11));




        try {
            System.out.println(parseNumber());
        } catch (NumberFormatException e) {
            System.err.println("Błędny numer. Nie podałeś liczby całkowitej");
        }

    }


}
