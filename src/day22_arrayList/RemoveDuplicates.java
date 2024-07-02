package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Vasyl","Vasyl","Sumeye","Sumeye","Ali","Sumeye","Shukir","Marika","Marika"));

        ArrayList<String> uniqueNames=new ArrayList<>();
        for (String each : names) {
           /* if (!uniqueNames.contains(each))
            {
                uniqueNames.add(each);
            }*/
            if(uniqueNames.contains(each))
            {
                continue;
            }
            uniqueNames.add(each);
        }

        //names is ready for garbage collection
        names=uniqueNames;
        System.out.println(names);

        ArrayList<String> n1=new ArrayList<>();
        ArrayList<String> n2=n1;

        n1.addAll(Arrays.asList("Vasyl","Sumeye","Ali","Shukir","Marika"));
        System.out.println("This is true: "+(n1==n2));

        ArrayList<String> n3=new ArrayList<>();
        ArrayList<String> n4=new ArrayList<>();
        n3.addAll(Arrays.asList("Vasyl","Sumeye","Ali","Shukir","Marika"));
        n4.addAll(Arrays.asList("Vasyl","Sumeye","Ali","Shukir","Marika"));
        System.out.println("This is false: "+(n3==n4));
        System.out.println("This is true: "+(n3.equals(n4)));


    }
}
