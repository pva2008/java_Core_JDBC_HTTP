package com.vpdev.oop.lesson25.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox + this.toString());

                        cashboxes.wait(5000L);

                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
                        cashboxes.wait(5000L);
//                        System.out.print(".");
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу" + this.toString());
                        cashboxes.wait();

                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}