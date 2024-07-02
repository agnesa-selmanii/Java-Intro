package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        //REMOVE method not good because the size if dynamic and if we want to
        //remove arr.get(i) <4 it will not remove all elements smaller than 4 because the position of elements changes
        //supports only non-primitives, dynamic
        ArrayList<Integer> list=new ArrayList<>(); // NOT <int> it doesn't accept it
        list.add(0); //0
        list.add(1); //1
        list.add(3); //2
        list.add(1,2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("---String ArrayList---");

        ArrayList<String> strList=new ArrayList<>();
        strList.add("Ana");
        strList.add("Bana");
        strList.add("Zana");
        strList.add("Bana");
        strList.add("Jana");

        System.out.println("IndexOf: "+strList.indexOf("Bana"));
        System.out.println("lastIndexOf: "+strList.lastIndexOf("Bana"));

        System.out.println(strList);
        System.out.println(strList.get(0));
        System.out.println(strList.get(strList.size()-1));

        System.out.println("ARRAYLIST ITERATION");
        for (Integer i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i)+"\t");
        }

        System.out.println("\nREVERSE ARRAYLIST ITERATION");
        for (Integer i = strList.size() - 1; i >= 0; i--) {
            System.out.print(strList.get(i)+"\t");
        }

        System.out.println("\n---CONTAINS METHOD---");

        System.out.println(strList.contains("Bana"));

        System.out.println("---Equals, IsEmpty---");

        ArrayList<Character> ch=new ArrayList<>();
        ch.add('a');
        ch.add('b');
        ch.add('c');

        ArrayList<Character> ch1=new ArrayList<>();
        ch1.add('a');
        ch1.add('b');
        ch1.add('c');

        System.out.println(ch.equals(ch1));
        System.out.println(ch==ch1);//false because it compares if it's the same object
        System.out.println(ch.isEmpty());

        System.out.println("--clear list and check if it's empty");
        ch.clear();;
        System.out.println(ch.isEmpty());

        System.out.println("---containsAll()---");

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.containsAll(Arrays.asList(10,30)));
        System.out.println(ch1.containsAll(Arrays.asList('a','c')));

        System.out.println("remove()-remove specific clear()-remove all");
        System.out.println("Removed element: "+arr.remove(0));
        System.out.println("After removed: "+arr);
        arr.clear();
        System.out.println("Cleared array: "+arr);

        System.out.println("\n\n addAll() is used to add one or more elements to the arrayList");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(20);
        list2.add(7);

        System.out.println("--------------------FOR EACH------------------------");

        for (Integer i : list2) {
            System.out.println("Element "+i);
        }
        //list2.addAll(list1);
        //System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        list2.addAll(Arrays.asList(10,20,300,30,2,2,3,34,3,45));
        System.out.println("After adding elements: "+list2);

        list2.removeAll(Arrays.asList(10,20,3));
        System.out.println("After removing elements: "+list2);

        System.out.println("---retainAll()---the elements you want to keep");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(30);
        list3.add(40);
        list3.add(80);
        list3.add(100);
        list3.retainAll(Arrays.asList(30,40));
        System.out.println("Elements I want to keep: "+list3);
    }
}
