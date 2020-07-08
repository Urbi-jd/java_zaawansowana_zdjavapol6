package com.sda.pizza;

public class PizzaFactorySwitch {
    public enum PizzaType {
        MARGERITA,
        HAWAII,
        BACON_AND_CHEESE;
    }

    public static Pizza bakePizza(PizzaType pizzaType) {
        Pizza pizza = new Pizza();

        switch (pizzaType) {
            case MARGERITA:
                pizza.addIngredient("sauce");
                pizza.addIngredient("cheese");
                break;

            case HAWAII:
                pizza.addIngredient("sauce");
                pizza.addIngredient("cheese");
                pizza.addIngredient("pianapple");
                break;

            case BACON_AND_CHEESE:
                pizza.addIngredient("sauce");
                pizza.addIngredient("bacon");
                pizza.addIngredient("cheese");
                break;
        }

        return pizza;

    }

}
