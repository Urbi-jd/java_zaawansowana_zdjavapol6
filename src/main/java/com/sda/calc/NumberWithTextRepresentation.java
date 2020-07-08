package com.sda.calc;

public class NumberWithTextRepresentation <N extends Number>{

    N number;
    String textNumber;

    public NumberWithTextRepresentation(N number, String textNumber) {
        this.number = number;
        this.textNumber = textNumber;
    }

    public N getNumber() {
        return number;
    }

    public String getTextNumber() {
        return textNumber;
    }

    public static void main(String[] args) {

        NumberWithTextRepresentation <Integer> numberWithTextRepresentation = new
                NumberWithTextRepresentation<>(45, "czterdzieści pięć");

        NumberWithTextRepresentation <Double> numberWithTextRepresentation2 = new
                NumberWithTextRepresentation<>(45.12, "czterdzieści pięć");

        NumberWithTextRepresentation <Long> numberWithTextRepresentation3 = new
                NumberWithTextRepresentation<>(451276578456756765L, "czterdzieści pięć");


        System.out.println(numberWithTextRepresentation.getNumber() + " " +
                numberWithTextRepresentation.getTextNumber());
    }
}
