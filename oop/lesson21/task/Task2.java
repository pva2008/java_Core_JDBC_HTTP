package com.vpdev.oop.lesson21.task;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );

//     //  Set<String> collect =
//               strings.stream()
//                .filter(s -> s.length() > 8)
//                       .collect(Collectors.toSet())
//              //  .collect(Collectors.toSet());
//       // System.out.println(collect);
        int result = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}