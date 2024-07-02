package day21_multiDimensionalArrays;

import utilities.ArraysUtility;

import java.util.Arrays;

public class IncreaseArraySize {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        //  int[] new_array=new int[array.length+1];
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        System.out.println(Arrays.toString(new_array));

        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ArraysUtility.addElement(array1, 9)));


        System.out.println("---String Array---");
        String[] words={"Hello","World"};
        words=ArraysUtility.addElement(words,"My Program");
        System.out.println(Arrays.toString(words));
        words=ArraysUtility.addElement(words,"Java is fun");
        System.out.println(Arrays.toString(words));

    }
}
