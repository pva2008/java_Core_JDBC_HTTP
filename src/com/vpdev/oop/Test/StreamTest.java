package com.vpdev.oop.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Integer[] array;
        list.add("Dima");
        list.add("Sveta");
        list.add("Valera");
        list.add("Olya");

        Map<Student, String> mapStudents = new HashMap<>();
        mapStudents.put(new Student(12, "Valera", 5.7), "Value");
        mapStudents.put(new Student(13, "Valera", 5.7), "Value");
        mapStudents.put(new Student(14, "Valera", 5.8), "Value");


//---------------------------------------map--------------------------------------------------------------------
        int[] array2 = {5, 9, 0, 8, 7, 3, 12};
        //   System.out.println(list.stream().map(element -> element + 3).collect(Collectors.toSet()));
//        List<Integer> list2 =list.stream().map(element->element.length()).collect(Collectors.toList());
//        array = (Integer[]) list.stream().map(( element)->{return 2;}).toArray(Integer []::new);
//        System.out.println(list2);
//        System.out.println(array.length);

//       array2 = Arrays.stream(array2).map(element->{if (element%3==0) return element; else return 0;}).toArray();
//        for (int i : array2) {
//            System.out.println(i);
//        }
//------------------------------------filter-----------------------------------------------------------------------------


//        mapStudents=   mapStudents.entrySet().stream().filter(element->element.getKey().getId()==12)
//                .collect(Collectors.toMap(Function.identity(), String::new));
//        System.out.println(mapStudents);


//        System.out.println(mapStudents.entrySet().stream().filter(element->element.getKey().getId()>12)
//                .collect(Collectors.toList()));

//------------------------------------forEach-----------------------------------------------------------------------------
//        mapStudents.entrySet().stream().filter(element->element.getKey().getId()==12)
//                .forEach(element-> System.out.println(element));


//        mapStudents.entrySet().stream().filter(element->element.getKey().getId()==12)
//                .forEach(System.out::println   );// просто вызов метода из класса
//------------------------------------Stream Create-----------------------------------------------------------------------------
        Stream<Map<Student, String>> mapStream = Stream.of(mapStudents);
        mapStream.forEach(e -> System.out.println(e));

    }
}




