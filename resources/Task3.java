package com.vpdev.oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 3. Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 */
private class Task3 {

//    private static void main(String[] args) throws IOException {
//        Path path = Path.of("resources","123", "test.txt");
//        Files.readAllLines(path).stream()
//                .map(Task3::findMaxDigitsCount)
//                .forEach(System.out::println);
//    }
//
//    private static Integer findMaxDigitsCount(String line) {
//        int result = 0;
//        int counter = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (Character.isDigit(line.charAt(i))) {
//                counter++;
//            } else {
//                if (result < counter) {
//                    result = counter;
//                }
//                counter = 0;
//            }
//        }
//        return result;
//    }

    private static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "123", "test.txt");
        Files.readAllLines(path).stream().map(Task3::findMaxDigitsCount).forEach(System.out::println);


    }

    private static Integer findMaxDigitsCount(String line) {
        int result = 0,
                counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;

            }
            else {
                if(result<counter){
                    result=counter;

                }
                counter=0;
            }

        }
        return result;
    }
}