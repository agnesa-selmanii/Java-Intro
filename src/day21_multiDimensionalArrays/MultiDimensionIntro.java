package day21_multiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionIntro {
    public static void main(String[] args) {
        //we use multi dimensional array when we have many arrays

        int[] a1={1,2,3};
        int[][] a2d={{4,5},a1};  //[]index i array, []index i elementit mrena array
        int a=a2d[0][0];
        System.out.println(a);
        System.out.println(Arrays.toString(a2d[0]));
        System.out.println(a2d[0][0]);
    }
}
