package com.vpdev.oop.Test;


import java.util.ArrayList;
import java.util.List;

public class WhoFaster {
    public static void main(String[] args) {
        long startTimeArraylist, endTimeArraylist, startTimeArray, endTimeArray;
        Integer[] array = new Integer[1_000_000_000];
        List<Integer> arrayList = new ArrayList<>(1_000_000_000);
        Time timeArrayADD = new Time("timeArrayADD");
        Time timeArrayRandomWrite = new Time("timeArrayRandomWrite");
        Time timeArrayListADD = new Time("timeArrayListADD");
        Time timeArrayListRandomWrite = new Time("timeArrayListRandomWrite");


        timeArrayListADD.setStartTime();
        for (int i = 0; i < 1_000_000_00; i++) {
            arrayList.add(i);


        }
        timeArrayListADD.setEndTimeA();

        timeArrayADD.setStartTime();
        for (int i = 0; i < 1_000_000_00; i++) {
            array[i] = i;
        }
        timeArrayADD.setEndTimeA();

        timeArrayListRandomWrite.setStartTime();
        for (int i = 0; i < 1_000_000_00; i++) {
            arrayList.set((int) (Math.random() * 1_000_000_00), i);


        }
        timeArrayListRandomWrite.setEndTimeA();


        timeArrayRandomWrite.setStartTime();
        for (int i = 0; i < 1_000_000_00; i++) {
            array[(int) (Math.random() * 1_000_000_00)] = i;
        }

        timeArrayRandomWrite.setEndTimeA();


        timeArrayListADD.delta();
        timeArrayADD.delta();
        System.out.println();
        timeArrayListRandomWrite.delta();
        timeArrayRandomWrite.delta();


    }
}

class Time {
    private long startTime, endTime;
    private String nameObject;

    public Time(String nameObject) {
        this.nameObject = nameObject;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTimeA() {
        return endTime;
    }

    public void setEndTimeA() {
        this.endTime = System.currentTimeMillis();
    }

    public void delta() {
        System.out.println(nameObject + " " + (endTime - startTime) + " мc");
        ;
    }


}
