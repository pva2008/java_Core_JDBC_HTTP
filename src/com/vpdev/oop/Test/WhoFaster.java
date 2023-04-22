package com.vpdev.oop.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class WhoFaster {

    static void deltatime(int limit, String name, Consumer<Integer> object) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            object.accept(i);
        }
        System.out.format("%-30s result: %s\n", name, (System.currentTimeMillis() - startTime));
    }


    public static void main(String[] args) {

        Integer[] array = new Integer[1_000_000_000];
        List<Integer> arrayList = new ArrayList<>(1_000_000_000);

        deltatime(1_000_000, "timeArrayListADD", (i) -> arrayList.add(i));
        deltatime(1_000_000, "timeArrayADD", (i) -> array[i] = i);
        deltatime(1_000_000, "timeArrayListRandomWrite", (i) -> arrayList.set((int) (Math.random() * i), i));
        deltatime(1_000_000, "timeArrayRandomWrite", (i) -> array[(int) (Math.random() * i)] = i);
//
        // -Xmx14g
        //       long startTimeArraylist, endTimeArraylist, startTimeArray, endTimeArray;
//        Time timeArrayADD = new Time("timeArrayADD");
//        Time timeArrayRandomWrite = new Time("timeArrayRandomWrite");
//        Time timeArrayListADD = new Time("timeArrayListADD");
//        Time timeArrayListRandomWrite = new Time("timeArrayListRandomWrite");


//        timeArrayListADD.setStartTime();
//        for (int i = 0; i < 1_000_000_00; i++) {
//            arrayList.add(i);
//
//
//        }
//        timeArrayListADD.setEndTimeA();
//
//        timeArrayADD.setStartTime();
//        for (int i = 0; i < 1_000_000_00; i++) {
//            array[i] = i;
//        }
//        timeArrayADD.setEndTimeA();
//
//        timeArrayListRandomWrite.setStartTime();
//        for (int i = 0; i < 1_000_000_00; i++) {
//            arrayList.set((int) (Math.random() * 1_000_000_00), i);
//
//
//        }
//        timeArrayListRandomWrite.setEndTimeA();
//
//
//        timeArrayRandomWrite.setStartTime();
//        for (int i = 0; i < 1_000_000_00; i++) {
//            array[(int) (Math.random() * 1_000_000_00)] = i;
//        }
//
//        timeArrayRandomWrite.setEndTimeA();
//
//
//        timeArrayListADD.delta();
//        timeArrayADD.delta();
//        System.out.println();
//        timeArrayListRandomWrite.delta();
//        timeArrayRandomWrite.delta();
//
//
//
//
    }
}
//
//class Time {
//    private long startTime, endTime;
//    private String nameObject;
//
//    public Time(String nameObject) {
//        this.nameObject = nameObject;
//    }
//
//    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime() {
//        this.startTime = System.currentTimeMillis();
//    }
//
//    public long getEndTimeA() {
//        return endTime;
//    }
//
//    public void setEndTimeA() {
//        this.endTime = System.currentTimeMillis();
//    }
//
//    public void delta() {
//        System.out.println(nameObject + " " + (endTime - startTime) + " мc");
//        ;
//    }
//
//
//}
