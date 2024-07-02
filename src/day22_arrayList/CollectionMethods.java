package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods {
    public static void main(String[] args) {
        //min, max, sort, reverse, swap, replaceAll, frequency

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,0,9,6,7,200,100));
        int min=Collections.min(list);

        System.out.println("Min: "+min);
        System.out.println("Max: "+Collections.max(list));

        Collections.sort(list);
        System.out.println("Sorted: "+list);

        Collections.reverse(list);
        System.out.println("Reversed: "+list);

        Collections.swap(list,0,1);
        System.out.println("Swap: "+list);

        Collections.swap(list,0,list.size()-1);
        System.out.println("Swap first with last: "+list);

        ArrayList<String> str=new ArrayList<>(Arrays.asList("Bana","Ana","Zana"));
        System.out.println(Collections.max(str));

        System.out.println("---replaceAll---");
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,100,12,12,12,200,100));
        Collections.replaceAll(list1,12,50);
        System.out.println(list1);

        System.out.println("---frequency---");
        System.out.println("Frequency: "+Collections.frequency(list1,50));
        System.out.println("Frequency: "+Collections.frequency(list1,12));
    }
}
