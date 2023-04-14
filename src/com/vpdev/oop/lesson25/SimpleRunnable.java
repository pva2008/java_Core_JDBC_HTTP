package com.vpdev.oop.lesson25;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        //Thread.currentThread().setName("Thread_SimpleRunnable");
        System.out.println("Hello " + Thread.currentThread().getName());
//        System.out.println("Hello " + getName());
    }
}