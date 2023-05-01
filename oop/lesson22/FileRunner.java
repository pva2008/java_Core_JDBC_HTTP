package com.vpdev.oop.lesson22;

import java.io.File;
import java.io.IOException;

/**
 * output stream
 * application --------> file
 * <p>
 * input stream
 * application <-------- file
 */
public class FileRunner {

    public static void main(String[] args) throws IOException {
        // File file = new File("resources/test.txt");
        File file = new File("resources/test.txt");
        //System.out.println(file.createNewFile());
//        System.out.println(file.createNewFile());
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());
        File dir = new File("resources/");
//        System.out.println( dir.mkdir());
//        System.out.println( dir.mkdirs());
        System.out.println(dir.listFiles()[0].getName());

//        File dir = new File("resources/test/dir");
//        dir.mkdirs();
    }
}
