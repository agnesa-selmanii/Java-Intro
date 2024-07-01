package day08_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';

        switch (grade){

            case 'B':
                System.out.println("Great Job");
                break;

            case 'A':
                System.out.println("Excellent");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}
