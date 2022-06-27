package com.sush.inheritance.hierarchical;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(23, 44);
        Shape triangle = new Triangle(2, 4);
        Shape sphere = new Sphere(4);

        System.out.println("Area of rectangle is: " + rectangle.area());
        System.out.println("Area of triangle is: " + triangle.area());
        System.out.println("Surface area of sphere is: " + sphere.area());
    }
}
