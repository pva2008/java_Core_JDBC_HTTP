package com.vpdev.oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 2. Задан файл с текстом, найти и вывести в консоль все слова,  для
 * которых последняя буква одного слова совпадает с первой буквой
 * следующего слова
 */
public class Task2 {

//    public static void main(String[] args) throws IOException {
//        Path path = Path.of("resources", "123","test.txt");
//        try (Scanner scanner = new Scanner(path)) {
//            String prev = null;
//            if (scanner.hasNext()) {
//                prev = scanner.next();
//            }
//            while (scanner.hasNext()) {
//                String current = scanner.next();
//                if (isEqualLastSymbolAndFirstSymbol(prev, current)) {
//                    System.out.println(prev + " " + current);
//                }
//                prev = current;
//            }
//        }
//    }
//
//    private static boolean isEqualLastSymbolAndFirstSymbol(String prev, String current) {
//        return prev.charAt(prev.length() - 1) == current.charAt(0);
//    }


    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "123", "test.txt");

        try (Scanner scanner = new Scanner(path)) {
            String previousWord = null;
            if (scanner.hasNext()) {
                previousWord = scanner.next();
            }
            String currentWord;
            while (scanner.hasNext()) {
                currentWord = scanner.next();
                isEqualLastSymbolAndFirstSymbol(previousWord, currentWord);
                previousWord = currentWord;
            }

        }
    }

    private static void isEqualLastSymbolAndFirstSymbol(String previousWord, String currentWord) {
        if (previousWord.charAt(previousWord.length() - 1) == currentWord.charAt(0)) {
            System.out.println(previousWord + " " + currentWord);
        }
    }
}