package com.sush.inheritance.hierarchical;

abstract class Shape {

    protected float length;
    protected float breadth;
    protected double base;
    protected double height;
    protected float radius;

    protected Shape(){}

    protected Shape(float length, float breadth){
         this.length = length;
         this.breadth = breadth;
    }

    protected Shape(double base, double height){
        this.base = base;
        this.height = height;
    }

    protected Shape(float radius){
        this.radius = radius;
    }

    abstract public float area();

}

class Rectangle extends Shape{

    Rectangle(float length, float breadth){
        super(length, breadth);
    }

    public float area(){
        return length * breadth;
    }
}

class Triangle extends Shape{

    Triangle(double base, double height){
        super(base, height);
    }

    public float area(){
        return (float) (base * height) / 2;
    }
}

class Sphere extends Shape{

    Sphere(float radius){
        super(radius);
    }

    public float area(){
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }
}