package com.vpdev.oop.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dima");
        list.add("Sveta");
        list.add("Valera");
        list.add("Olya");
        System.out.println(list.stream().map(element -> element + 3).collect(Collectors.toSet()));
    }
}
