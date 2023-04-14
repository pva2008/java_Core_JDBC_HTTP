package com.vpdev.oop.lesson25;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("Thread_SimpleThread");
        System.out.println("Hello " + Thread.currentThread().getName());
//        System.out.println("Hello " + getName());
    }
}