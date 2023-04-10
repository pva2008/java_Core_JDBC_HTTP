package com.vpdev.oop.lesson21;

import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("22", "12", "14", "98", "78", "33");
        for (String element : list) {
            String value = element + element;
            Integer i = Integer.valueOf(value);
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
        list.stream().map((a) -> (a + a)).map(Integer::valueOf).filter(value -> value % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);

    }
}
