package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;


        System.out.println("Which room would you like to select?");
        System.out.println("\t\tKing Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle Bed == $80");

        String word = input.nextLine().toLowerCase();

        while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            word = input.nextLine().toLowerCase();
        } // to make sure user selected either the king bed, or queen bed or single bed

        total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

        System.out.println("Your total price is: $" + total);

        input.close();
    }
}
