package day09_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = input.nextInt();

        input.close();

        int dollar = cents / 100;

        cents -= dollar * 100;

        System.out.println(dollar+" dollars and "+cents+" cents");
    }
}
