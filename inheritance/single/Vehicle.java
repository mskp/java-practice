package com.sush.inheritance.single;

abstract public class Vehicle {
    private String type;
    private String engineType;
    private int noOfWheels;
    private int speed;
    private float price;

    public Vehicle(){}

    public Vehicle(String type, String engineType, int noOfWheels, int speed, float price) {
        this.type = type;
        this.engineType = engineType;
        this.noOfWheels = noOfWheels;
        this.speed = speed;
        this.price = price;
    }

    abstract public void blowHorn();
}

class Car extends Vehicle{
    public Car() {}

    public Car(String type, String engineType, int noOfWheels, int speed, float price) {
        super(type, engineType, noOfWheels, speed, price);
    }

    public void blowHorn(){
        System.out.println("Beep");
    }
}
