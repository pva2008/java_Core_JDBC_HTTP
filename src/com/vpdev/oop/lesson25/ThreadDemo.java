package com.vpdev.oop.lesson25;

import java.sql.SQLOutput;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        var runnableThread = new Thread(new SimpleRunnable(), "My Name");
        var thread1 = new Thread(new SimpleRunnable(), "thread1");
        var lambdaThread = new Thread(() -> {
            Thread.currentThread().setName("lambdaThread");
            System.out.println("Hello from lambda: " + Thread.currentThread().getName());
        });
        System.out.println(lambdaThread.getState());
        lambdaThread.start();

        runnableThread.start();
        simpleThread.start();
        thread1.start();

        try {

            thread1.join(1000);
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());

            runnableThread.join(000);

            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//
//        simpleThread.start();
//        runnableThread.start();
//        lambdaThread.start();
//        try {
//            simpleThread.join();
//            runnableThread.join();
//            lambdaThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName());
    }
}