package day21_multiDimensionalArrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4,45,3,2,3,3,3,22,4,3,43,43,4,34,3};
        if (array.length <= 1) {
            System.out.println(Arrays.toString(array));
        }

        int[] uniqueArray = new int[array.length]; // Create a new array to store unique elements
        int index = 0;

        Arrays.sort(array); // Sort the input array

        // Check for duplicates while iterating through the sorted array
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArray[index++] = array[i]; // Add unique elements to the new array
            }
        }

        uniqueArray[index++] = array[array.length - 1];
        int[] new_unique=  Arrays.copyOf(uniqueArray, index);
        System.out.println(Arrays.toString(new_unique));
    }
}
