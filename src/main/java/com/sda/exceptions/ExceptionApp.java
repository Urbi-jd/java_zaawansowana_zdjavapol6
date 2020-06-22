package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {

        try {
            Object object = null;
            object.hashCode();
            System.out.println("Po wywaleniu hascode");
        } catch (NullPointerException exception) {
            System.out.println("NULL !!");
        } finally {
            System.out.println("Zamykanie aplikacji");
        }

        System.out.println("Ostatnie słowo");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("ArrayIndexOutOfBoundsException");
        try {
            //ArrayIndexOutOfBoundsException
            int[] tab = new int[4];
            System.out.println(tab[4]);
            System.out.println("koniec try");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Wleciałeś poza zakres");
        } finally {
            System.out.println("Zamykam apke");
        }
        System.out.println();
        System.out.println("IndexOutOfBoundsException");

        try {
            //IndexOutOfBoundsException
            List<String> textList = new ArrayList<>();
            textList.add("ala");
            String text2 = textList.get(2);
            System.out.println("Koniec try");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Wleciałeś poza zakres");
        } finally {
            System.out.println("Zamykam apke");

        }

        System.out.println();
        System.out.println("NullPointerException");
        try {
            //NullPointerException
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException exception) {
            System.out.println("złapałem NULL'a");
        } finally {
            System.out.println("Zamykam apkę");
        }
        System.out.println();
        System.out.println();




        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();
        try {
//            greet(name);
        } catch (IllegalArgumentException exception){
            System.out.println("Error happened " + exception.getMessage());
         }


    }

//    private static void greet(String who) throws IndexOutOfBoundsException{
//        if (who == null || who.isBlank()) {
//            throw new InvalidNameException(who);
//        }
//        System.out.println("Hello, " + who);
//    }
}
