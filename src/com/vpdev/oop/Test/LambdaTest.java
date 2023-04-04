package com.vpdev.oop.Test;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;

public class LambdaTest {


    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("2");
        l.add("3");
        l.removeIf(x -> (Integer.parseInt(x) == 3));
        for (String integer : l) {
            System.out.println(integer);

        }
        System.out.println(method1(2, 2, (Integer a, Integer b) -> {
            return a + b;
        }));


    }

    static int method1(int a, int b, ToIntBiFunction<Integer, Integer> av) {
        return av.applyAsInt(a, b);


    }
}


