package day22_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();

        array.add(10);
        array.add(15);

        int sum=0;
        for (Integer i : array) {
            sum+=i;
        }

        double avg=sum/(double)array.size();

        System.out.println(avg);
    }
}
