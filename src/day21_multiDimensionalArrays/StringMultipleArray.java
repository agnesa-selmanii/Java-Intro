package day21_multiDimensionalArrays;

import java.util.Arrays;

public class StringMultipleArray {
    public static void main(String[] args) {
        //DEEP TO STRING METHOD
        String[] gr1 = {"Ana", "Bana"};
        String[] gr2 = {"Dana", "Mana", "Zana"};
        String[] gr3 = {"Lana"};


        System.out.println("deepToString()");

        String[][] multi = {gr1, gr2, gr3};
        System.out.println(Arrays.deepToString(multi));

        System.out.println("---Array Print---");
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.println(multi[i][j]);
            }
        }

        System.out.println("-----ForEach-----");
        for (String[] str : multi) {
            for (String s : str) {
                System.out.println(s);
            }
        }
    }
}
