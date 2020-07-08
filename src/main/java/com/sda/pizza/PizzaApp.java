package com.sda.pizza;

import java.util.List;

public class PizzaApp {

    public static void main(String[] args) {

        PizzaType.menu();
        try{
        Pizza pizza5 = PizzaType.getPizza(PizzaType.order());
            System.out.println(pizza5);
        } catch (NullPointerException e){
            System.out.println("Nie mamy takiej pizzy");
        }


//        PizzaFactorySwitch pizzaF = new PizzaFactorySwitch();
//        Pizza pizza1 = pizzaF.bakePizza(PizzaFactorySwitch.PizzaType.MARGERITA);
//        List<String> ingred = pizza1.getIngredients();
//        System.out.println(ingred);
//
//        System.out.println(pizza1);
//
//        Pizza pizza2 = PizzaFactorySwitch.bakePizza(PizzaFactorySwitch.PizzaType.BACON_AND_CHEESE);
//        pizza2.toString();
//
//        Pizza pizza3 = PizzaType.getPizza(PizzaType.MARGERITA);
//        System.out.println(pizza3);
//
//        Pizza pizza4 = PizzaType.getPizza(PizzaType.PEPPERONI);
//        System.out.println(pizza4);


    }
}
