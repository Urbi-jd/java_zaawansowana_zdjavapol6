package com.sda.pizza;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public enum PizzaType {


    MARGERITA(19.90) {
        @Override
        Pizza bake() {
            Pizza pizza = new Pizza();
            pizza.addIngredient("sauce");
            pizza.addIngredient("cheese");
            return pizza;
        }
    },
    HAWAII(22.90) {
        @Override
        Pizza bake() {
            Pizza pizza = new Pizza();
            pizza.addIngredient("sauce");
            pizza.addIngredient("cheese");
            pizza.addIngredient("pianapple");
            return pizza;
        }
    },
    BACON_AND_CHEESE (25.90){
        @Override
        Pizza bake() {
            Pizza pizza = new Pizza();
            pizza.addIngredient("sauce");
            pizza.addIngredient("bacon");
            pizza.addIngredient("cheese");
            return pizza;

        }
    },
    PEPPERONI (24.90){
        @Override
        Pizza bake() {
            Pizza pizza = new Pizza();
            pizza.addIngredient("pepperoni");
            pizza.addIngredient("sauce");
            pizza.addIngredient("cheese");
            return pizza;
        }
    };

    private double price;

    PizzaType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract Pizza bake();

    public static Pizza getPizza(PizzaType pizzaType) {
        return pizzaType.bake();
    }

    public static void menu(){
        System.out.println("Menu:");
       for (PizzaType pizza : PizzaType.values()){
           System.out.println(pizza + " " + pizza.price + " zł");
       }
    }

    public static PizzaType order() throws NullPointerException{
        PizzaType[] listOfPizzaTypes = PizzaType.values();
        System.out.println("Jaką pizzę wybierasz");
        Scanner sc = new Scanner(System.in);
        String orderedPizza = sc.nextLine();

        for (PizzaType listOfPizzaType : listOfPizzaTypes) {
            if(orderedPizza.equals(listOfPizzaType.toString()))
            return listOfPizzaType;
        }
//
//        if(orderedPizza.equals("MARGERITA")){
//            return PizzaType.MARGERITA;
//        }
//        if(orderedPizza.equals("HAWAII")){
//            return PizzaType.HAWAII;
//        }
//        if(orderedPizza.equals("BACON_AND_CHEESE")){
//            return PizzaType.BACON_AND_CHEESE;
//        }
//        if(orderedPizza.equals("PEPPERONI")){
//            return PizzaType.PEPPERONI;
//        }
        return null;
    }
}
