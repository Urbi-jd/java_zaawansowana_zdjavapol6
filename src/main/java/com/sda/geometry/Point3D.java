package com.sda.geometry;

public class Point3D extends Point2D{
    double z;

    Point3D(){
        System.out.println("Empty Point3D constructor");
    }

    Point3D(double z) {
        this.z = z;
    }

    Point3D(double x, double y, double z) {
        super(x, y);
        System.out.println("Parametric Point3D Constructor");
        this.z = z;
    }
}
