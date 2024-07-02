package day21_multiDimensionalArrays;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveAddToSpecificIndexElementArray {
    public static void main(String[] args) {

        System.out.println("---Remove element to specific position---");
        int[] numbers = {10, 20, 30};
        int index = 1;

        int[] newArray = Arrays.copyOf(numbers, numbers.length - 1);
        int newIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (index != i) {
                newArray[newIndex] = numbers[i];
                newIndex++;
            }
        }
        System.out.println(Arrays.toString(newArray));


        System.out.println("---Add element to specific position---");

        int[] nr = {10, 20, 30};
        int ind = 1; // Position where the element should be added
        int element = 40;

        int[] newNr = Arrays.copyOf(nr,nr.length+1); // Create a new array with space for the additional element
        int newInd = 0;

        for (int i = 0; i < newNr.length; i++) {
            if (i == ind) {
                newNr[i] = element; // Add the element at the specified position
            } else {
                newNr[i] = nr[newInd]; // Copy elements from original array to new array
                newInd++;
            }
        }

        System.out.println(Arrays.toString(newNr));

        System.out.println("---Use Remove Method---");
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(ArraysUtility.removeElementSpecificIndex(a,2)));

        System.out.println("---Use Add Method---");
        int[] b={1,2,3,4,5};
        System.out.println(Arrays.toString(ArraysUtility.addElementSpecificIndex(b,2,50)));
    }
}
