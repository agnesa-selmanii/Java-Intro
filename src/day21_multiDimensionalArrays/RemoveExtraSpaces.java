package day21_multiDimensionalArrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str="Hello   world what's        up";
        String[] words=str.split(" ");

        str="";
        for (String each : words) {
            if(!each.isEmpty())
            {
               str+=each+" ";
            }
        }
        System.out.println(str.trim());
    }
}
