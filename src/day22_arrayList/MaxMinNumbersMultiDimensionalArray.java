package day22_arrayList;

public class MaxMinNumbersMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{100, 20, -30}, {45, 566, 5}, {12}};

        int max = array[0][0];
        int min = array[0][0];

        for (int[] i : array) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
                if (j < min) {
                    min = j;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
