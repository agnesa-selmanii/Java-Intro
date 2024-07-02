package day21_multiDimensionalArrays;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D={{1,2},{3,4}};
        int[][] arr2Dn={{5,6},{7,8}};

        int[][][] arr3D={arr2D,arr2Dn};
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("---------ARRAY ITERATION---------");
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[j].length; k++) {
                    System.out.println(arr3D[i][j][k]);
                }
            }
        }

        System.out.println("---------REVERSE ARRAY ITERATION---------");
        for (int i = arr3D.length-1; i >=0; i--) {
            for (int j = arr3D[i].length-1; j >=0; j--) {
                for (int k = arr3D[j].length-1; k >=0; k--) {
                    System.out.println(arr3D[i][j][k]);
                }
            }
        }

    }
}
 /*int[][][] arr3Dn={{{1,2}}};
        System.out.println(Arrays.deepToString(arr3Dn));*/