package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your current speed");
        int currentSpeed = input.nextInt();

        input.close(); // we no longer need scanner after this line

        int overTheLimit = currentSpeed - speedLimit;

        if(overTheLimit > 0){
            System.out.println("You are driving "+ overTheLimit +" mph over the limit. Slow down!");
        }
    }
}
