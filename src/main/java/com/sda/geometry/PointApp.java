package com.sda.geometry;

public class PointApp {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();

        System.out.println(point1.x + ", " + point1.y);

        Point2D point2 = new Point2D(1.0,12.0);
        System.out.println(point2.x + ", " + point2.y);

        Point3D point3D = new Point3D();
        Point3D secoundPoint3D = new Point3D(1,2,3);

        point3D.x = 2;
        point3D.y = 2;
        point3D.z = 2;

    }
}
