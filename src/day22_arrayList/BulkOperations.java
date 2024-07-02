package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        System.out.println("-----addAll()-----");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Vasyl", "Vasyl", "Sumeye", "Sumeye", "Ali", "Sumeye", "Shukir", "Marika", "Marika"));
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        Integer[] nums = {1, 2, 3};
        numbers.addAll(Arrays.asList(nums));

        ArrayList<Integer> newNumbers = new ArrayList<>(Arrays.asList(nums));

        numbers.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println("Numbers elements: " + numbers);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println("List1 elements before: " + list1);
        System.out.println("newNumbers elements: " + newNumbers);

        list1.addAll(1, numbers);
        System.out.println("List1 elements after: " + list1);

        System.out.println();

        System.out.println("-----containsAll()-----");
        System.out.println(names.containsAll(Arrays.asList("Vasyl", "Ali", "Marika")));

        System.out.println();

        System.out.println("-----removeAll()-----");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 1, 2, 3, 10));
        list.removeAll(Arrays.asList(10, 20));
        System.out.println(list);

        System.out.println();

        System.out.println("-----retainAll() Elements I want to keep-----");
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 1, 2, 3, 10));
        li.retainAll(Arrays.asList(10, 20));
        //li.removeAll(Arrays.asList(10,20)); removes the retained elements, so the size=0
        System.out.println(li);

    }
}
