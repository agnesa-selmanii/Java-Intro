package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aaabbbbbccccc";
        String result="";
        String[] arr=str.split("");
        for (String s : arr) {
           int frequency= Collections.frequency(Arrays.asList(arr),s);

           if(!result.contains(s))
           {
               result+=s+frequency;
           }
        }
        System.out.println(result);
    }
}
