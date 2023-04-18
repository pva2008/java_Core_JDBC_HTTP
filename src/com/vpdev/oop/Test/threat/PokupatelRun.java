package com.vpdev.oop.Test.threat;

import java.util.Queue;

public class PokupatelRun implements Runnable {
    private final Queue<Kassa> queue;

    public PokupatelRun(Queue<Kassa> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            if (!queue.isEmpty()) {

                Kassa kassa = queue.remove();
                System.out.println("Занята касса " + kassa.toString() + " потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.add(kassa);
            } else {
                System.out.println(Thread.currentThread() + " Ожидает");
                try {
                    Thread.sleep(3L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
