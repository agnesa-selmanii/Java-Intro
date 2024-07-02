package day15_whileLoop;

import java.util.Scanner;

public class UntilNegativeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("Enter a number");
            int num = input.nextInt();
            if( num < 0){
                break;
            }
            sum += num;
        }


        System.out.println(sum);

        input.close();

    }
}
