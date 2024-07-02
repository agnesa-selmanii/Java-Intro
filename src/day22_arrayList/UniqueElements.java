package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Vasyl","Vasyl","Sumeye","Sumeye","Ali","Sumeye","Shukir","Marika","Marika"));

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each))
            {
                System.out.print(each+"\t");
            }
        }

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each))
            {
                System.out.println("\nFirst unique element: "+each+"\t");
                break;
            }
        }
    }
}
