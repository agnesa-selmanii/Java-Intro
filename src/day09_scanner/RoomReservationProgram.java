package day09_scanner;

import java.util.Scanner;

public class RoomReservationProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\tWelcome to the Cydeo Skyline Inn!");

        System.out.println("Would you like to reserve a room? (Yes/No)");
        String answer = input.next().toLowerCase();

        if ( !( answer.equals("yes") || answer.equals("no") ) ){ // if the user entered answer is invalid
            System.err.println("Invalid answer, please try again later!");
            System.exit(1);
        }

        if(answer.equals("no")){
            System.out.println("You have a wonderful day!");
            System.exit(0);
        }

        System.out.println("Enter your first name:");
        String firstName = input.next();
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase(); // abCdE ==> Abcde


        System.out.println("Enter your last name:");
        String lastName = input.next();
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase(); // abCdE ==> Abcde

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if( age <=0 ){ // if the user entered invalid age
            System.err.println("Invalid age, please try again later!");
            System.exit(1);
        }

        double discount = 0;

        if(age >= 64){ // Senior discount
            discount += 0.1;
        }

        System.out.println("Here are our available rooms and their prices:\n" +
                "\t\t\t\t\t\t\t\t\t King Bed   ===== $160\n" +
                "\t\t\t\t\t\t\t\t\t Queen Bed  ===== $120\n" +
                "\t\t\t\t\t\t\t\t\t Single Bed ===== $100\n" +
                "\n" +
                "Which room would you like to reserve? (King/Queen/Single)");

        String roomType = input.next().toLowerCase();

        if( !(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single")) ){ // if invalid room type is entered
            System.err.println("Invalid room type, please try again later!");
            System.exit(1);
        }

        double roomPrice = (roomType.equals("king")) ? 160 :(roomType.equals("queen"))? 120 : 100;

        System.out.println("How many nights would you like to stay?");
        int numberOfNights = input.nextInt();

        if( numberOfNights <= 0){ // if the user entered numberOfNights is invalid
            System.err.println("Invalid number, please try again later!");
            System.exit(1);
        }

        System.out.println("Are you a veteran? (Yes/No)");
        answer = input.next().toLowerCase();

        input.close();

        if ( !( answer.equals("yes") || answer.equals("no") ) ){ // if the user entered answer is invalid
            System.err.println("Invalid answer, please try again later!");
            System.exit(1);
        }

        if(answer.equals("yes")){ //if the user is veteran
            discount += 0.15;
        }

        double totalPrice = roomPrice * numberOfNights;
        double totalTax = totalPrice * 0.08;
        double totalDiscount = totalPrice * discount;
        double grandTotal = (totalPrice + totalTax)  - totalDiscount;

        System.out.println("Hello " + firstName +", , You have selected " + roomType +" Bed for " + numberOfNights + " nights to stay.");
        System.out.println("Room fee: $"+totalPrice);
        System.out.println("Tax is: $" + totalTax);

        if(discount > 0){ //if the person has discount
            System.out.println("Discount is: $" +totalDiscount);
        }

        System.out.println("Your grand total is: $"+ grandTotal);
    }
}
