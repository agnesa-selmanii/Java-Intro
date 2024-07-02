package day21_multiDimensionalArrays;

import java.util.Arrays;

public class ArrayOfUniqueElements {
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,6,6,6,6,7};
        int[] dups=new int[array.length];
        int newIndex=0;
        for (int i = 0; i < array.length; i++) {
            int element=array[i];
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if(array[j]==element) {
                    count++;
                }
            }
            if (count==1)
            {
                dups[newIndex]=array[i];
                newIndex++;
            }
        }
        int[] result = Arrays.copyOf(dups, newIndex);
        System.out.println(Arrays.toString(result));
    }
}
