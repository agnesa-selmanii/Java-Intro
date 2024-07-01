package day03_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // DataType variableName = Data

        // byte a = "Java"; //byte only accepts integer numbers (-128 ~127)
        //  byte a = 20.5;  // byte can not take decimal number
        //   byte a = 2000; // out of Byte range  (-128 ~127)
        byte a = 20;

        // price of the car is $17500

        short p = 17500;

        // salary is 95000
        int s = 95000;  //preferred

        //   int number = 9999999999;
        long number = 9999999999L;


        // gpa is 3.5
        double gpa1 =  3.5; // preferred
        float gpa2 =  3.5F;

        // DataType variableName = Data

        char b = '@';
        char c = '!';
        // char ab = 'ab';

        System.out.println(b);
        System.out.println(c);

        System.out.println("------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("------------------------------------");

        char ch3 = 9000;

        System.out.println(ch3);

        System.out.println("-------------------------------------------");

        int sum = 'A' + 'B';
        //         65 + 66

        System.out.println(sum);

        System.out.println("--------------------------------------------");

        // char ch4 = -100;

        //boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);

    }
}
