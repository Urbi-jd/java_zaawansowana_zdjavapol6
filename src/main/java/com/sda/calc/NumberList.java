package com.sda.calc;

import java.util.ArrayList;
import java.util.List;

public class NumberList <N extends Number> {

    private List<N> numbers = new ArrayList<>();

    public void addNumber (N number){
        numbers.add(number);
    }

    public double getAvg(){
        double sum = 0;
        int counter = 0;
        for (N number : numbers) {
            sum += number.doubleValue();
            counter++ ;
        }
        return sum / counter;
    }

    public int getIntSum(){
        int sum = 0;
        for(N number : numbers){
            sum += number.intValue();
        }
        return sum;
    }

    public boolean hasSameIntSum (List<? extends Number> list){
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
        }
        if(getIntSum() == sum){
            return true;
        } else
            return false;
    }

}
