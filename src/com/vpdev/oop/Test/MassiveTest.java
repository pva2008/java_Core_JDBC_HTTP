package com.vpdev.oop.Test;

public class MassiveTest {
    public static void main(String[] args) {
//        int[][] array;
//        array = new int[2][7];
        // array[0][2]=2;
        //  System.out.println(array.length);
        // System.out.println(array[0][2]+" "+array.length+" "+  array[array.length-1].length);
//------------------------------------------------------------------------------------------------------------------------
//
//        int[][] array3 = new int[3][9];
//
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                array3[i][j] = 0;
//                System.out.print(array3[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(" "+array3.length+" "+  array3[array3.length-1].length);
// ------------------------------------------------------------------------------------------------------------------------


        int[][] array2 = {{2, 2}, {2, 0}, {3, 3, 3}, {1}};
        for (int[] element : array2) {
            for (int el : element) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
