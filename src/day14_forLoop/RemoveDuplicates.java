package day14_forLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "xxxxxxxxxxzzzzzzzyyyyyyyyyxxxxxxxzzzzzzz";

        String result = "";   //"xyz"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);   // each character of the String str

            if( ! result.contains( ""+ each)  ){
                result += each;
            }

        }

        System.out.println(result);
    }
}
