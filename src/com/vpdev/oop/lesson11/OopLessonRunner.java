package com.vpdev.oop.lesson11;


public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ssd, ram);
        Laptop laptop = new Laptop(ssd, ram, 2);
        computer.load();
        double sin = Math.sin(2.5);
    }
}