package com.sda.triangles;

public class TriangleApp {
    public static void main(String[] args) {

        TriangleCalculation triangleCalculation = new TriangleCalculation();


        try {
            System.out.println(triangleCalculation.calculateTriangleCircuit(4, 12, 5));
        } catch (CannotBuildTriangleException e){
            System.err.println("Nie można zbudować trójkąta z boków: " + e.a + ", " + e.b + ", " + e.c);
        }
    }
}
