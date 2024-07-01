package day06_ifStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 20.5,
                n2 = 10.5;

        char operator = '+';

        double result = 0;

        if(operator == '+'){
            result = n1 + n2;
        }

        if(operator == '-'){
            result = n1 - n2;
        }

        if(operator == '*'){
            result = n1 * n2;
        }

        if(operator == '/'){
            result = n1 / n2;
        }

        System.out.println(result);
    }
}
