package com.sda.triangles;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TriangleCalculation {

    double calculateTriangleCircuit(double a, double b, double c){
        double[] numbers = new double[]{a, b, c};
        Arrays.sort(numbers);
        if(numbers[0] + numbers[1] < numbers[2]){
            throw new CannotBuildTriangleException(a, b, c);
        }
        return a + b +c;
    }

}
