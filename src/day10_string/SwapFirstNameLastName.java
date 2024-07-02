package day10_string;

import java.util.Scanner;

public class SwapFirstNameLastName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email=scan.nextLine();
        String first=email.substring(0,email.indexOf('_'));
        String last= email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String domain=email.substring(email.indexOf('@'));
        System.out.println(last);

        email=last+"_"+first+domain;
        System.out.println(email);
    }
}
