package com.sda.generic;

public class Box <T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void excamleGenericMethod(T argument) {
        System.out.println("Argument " + argument.toString());
        System.out.println("Argument class " + argument.getClass().getCanonicalName());
    }
}
