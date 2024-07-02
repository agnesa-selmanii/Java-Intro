package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        Integer[] array={1,2,3};
        ArrayList<Integer> array1=new ArrayList<>(Arrays.asList(array));
        System.out.println(array1);

        System.out.println("------------------------Convert ArrayList to Array------------------------");

        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Java","Python"));

        String[] languages=list2.toArray(new String[4]); //suggested to put 0 because it returns new array, but then I can't use lang[2] bc I have not enough indexes
        //new String[4] 4 specifiec the minimal size, or u can do new String[list2.size()]
        languages[2]="C#";
        System.out.println(Arrays.toString(languages));
        System.out.println(list2);
    }
}
