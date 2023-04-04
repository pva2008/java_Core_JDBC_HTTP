package com.vpdev.oop.Test;

public class BindingTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();


        vehicle.start();
        ((Car) vehicle).start();
        System.out.println();
        vehicle.stop();
        ((Car) vehicle).stop();

    }
}

class Vehicle {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    void start() {
        System.out.println("Vehicle Started");
    }

    static void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car Started");
    }

    static void stop() {
        System.out.println("Car Stopped");
    }
}

