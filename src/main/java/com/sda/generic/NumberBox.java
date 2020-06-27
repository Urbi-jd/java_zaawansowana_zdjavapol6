package com.sda.generic;

public class NumberBox <T extends Number> extends Box<T>{

    public boolean hasSameValue(NumberBox<?> otherBox) {
        return  otherBox.getT().doubleValue() == this.getT().doubleValue();
    }
}
