package com.sda.generic;

public class NumberBox <T extends Number> extends Box<T> {

    boolean hasSameValue (NumberBox<? extends Number> otherBox){
        return this.getT().intValue() == otherBox.getT().intValue();
    }
}
