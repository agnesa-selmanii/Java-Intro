package day10_string;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name:");
        String first=scan.nextLine().trim().replace(" ","");
        System.out.println("Enter last name:");
        String last=scan.nextLine().trim().replace(" ","");

        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        System.out.println(first+" "+last);
    }
}
