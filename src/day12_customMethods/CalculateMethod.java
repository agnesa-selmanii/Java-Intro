package day12_customMethods;

public class CalculateMethod {
    public static void main(String[] args) {

        //double n = calculate(1, '+', 2);

        calculate(1, '/', 0);

        calculate(10, '+', 30.5);


    }

    public static void calculate(double num1, char operator, double num2) {

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        System.out.println("Result: " + result);

    }


    public static void calculate(int num1, char operator, int num2) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        System.out.println("Result: " + result);

    }

}
