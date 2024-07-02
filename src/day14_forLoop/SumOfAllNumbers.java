package day14_forLoop;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        if(num < 0){
            System.out.println("Invalid Number");
        }else{
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
