package com.sda.calc;

public class CalcApp {
    public static void main(String [] args){

        OperationsCalculator calc = new OperationsCalculator(new Multiplication());
        System.out.println(calc.operation.calculate(5, 4));
        calc.setOperation(new Expotentiation());
        System.out.println(calc.operation.calculate(5, 3));
        System.out.println(calc.applyOperation(7, 2));

        Addition add = new Addition();
        calc.setOperation(add);
        System.out.println(calc.applyOperation(7, 5));

    }
}
