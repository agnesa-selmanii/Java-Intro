package day21_multiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2}, {3, 4, 5}};

        for (int i = 0; i < arr2D.length; i++) {
            // System.out.println(Arrays.toString(arr2D[i]));
            // int[] arr1D=arr2D[i];
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("---ForEach Loop---");
        for (int[] i : arr2D) {
            System.out.println(Arrays.toString(i));

            for (int j : i) {
                System.out.println(j);
            }
        }

        System.out.println("---Reversed Array---");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("---ForEach can not reverse---");
    }
}
