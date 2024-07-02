package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();

        array.addAll(Arrays.asList(23,2,3,4,52,1,2,3,0,90,87,233));

        System.out.println("The whole array list: \n"+array+"\n");

        /*for (int i = 0; i < array.size(); i++) {
            if(array.get(i)<10){
                array.remove(i);
            }
        }
        System.out.println("Array after deleting elements smaller than 10: \n"+array+"\n");*/

        for (int i = 0; i < array.size(); i++) {
            array.removeIf(j ->j<10);
        }
        System.out.println("Deleting all elements smaller than 10: \n"+array);
    }
}
