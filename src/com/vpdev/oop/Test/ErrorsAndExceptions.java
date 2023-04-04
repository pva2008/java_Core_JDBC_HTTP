package com.vpdev.oop.Test;

public class ErrorsAndExceptions {
    public static void main(String[] args) throws Exception {
        Test12 t = new Test12();
        t.testMethod();

    }

}

class Test12 {
    void testMethod() throws Exception {
//        try {
        throw new Exception();
//
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getClass());
//        }
//        finally {
//            System.out.println("finally");
//            System.out.println();
//        }

    }

}
