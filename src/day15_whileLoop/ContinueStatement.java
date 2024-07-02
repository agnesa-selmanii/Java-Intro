package day15_whileLoop;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Would you like to continue?");
            String answer = input.next();
            if(answer.equals("yes") || answer.equals("no")){
                // return;
                break;
                //  continue;
            }
        }


        //  System.out.println("Hello World");

        System.out.println("------------------------------------------");

        String str = "AABBCC";

        String result = "";  //"ABC"

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){  // if the character has already been added to result
                continue; // then skip to the next
            }

            result += str.charAt(i);

        }

        System.out.println("result = " + result);

    }
}
