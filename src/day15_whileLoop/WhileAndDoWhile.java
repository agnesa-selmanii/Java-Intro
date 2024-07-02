package day15_whileLoop;

import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Enter an even number?");
        int num = input.nextInt();

        while( num % 2 != 0 ){  // while the user input is invalid
            System.out.println("Invalid entry, please re-enter");
            num = input.nextInt();
        }
        System.out.println("You have entered: " +num);

         */
        System.out.println("----------------------------------------------");

        int num = 0;

        do {
            System.out.println("Enter an even number?");
            num = input.nextInt();
        } while (num % 2 != 0);

        /*
        while(num % 2 != 0){
            System.out.println("Enter an even number?");
            num = input.nextInt();
        }
*/
    }
}
