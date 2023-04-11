package com.vpdev.oop.lesson22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) throws IOException {
//        File file = new File(String.join(File.separator, "resources", "test.txt"));
//        File file =new File(String.join(File.separator, "resources" ,"123","text.txt"));
        File file = Path.of("resources", "123", "test.txt").toFile();
//        byte [] bytes;
//        String s;
//        try (FileInputStream inputStream = new FileInputStream(file)) {
////
////             bytes = inputStream.readAllBytes();
////             s = new String(bytes);
//
//            bytes = new byte[inputStream.available()];
//            System.out.println(inputStream.available());
//
//
//        }
        //  System.out.println(s);
//
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }

            System.out.println(new String(bytes));
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
//            byte[] bytes = inputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}