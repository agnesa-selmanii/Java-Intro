package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(5, 2, 3, 3, 4, 5, 6,7,10));

        for (Integer i : array) {
            int count = 0;
            for (Integer j : array) {
                if (j == i) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First unique element: " + i + " frequency: " + count);
                break;
            }
        }

        array.set(1, 6);
        System.out.println(array);

        //to remove object 10 not based in index we have to wrap it
        System.out.println(array.remove(Integer.valueOf(10)));
        System.out.println(array);

    }
}
