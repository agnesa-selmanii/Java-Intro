package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHours = input.nextInt();

        System.out.println("Enter your state tax rate(in percentage)");
        double stateTaxRate =input.nextDouble() / 100;

        System.out.println("Enter your federal tax rate (in percentage)");
        double federalTaxRate =input.nextDouble() / 100;

        input.close();

        double salary = hourlyRate * weeklyHours * 52; // 52 weeks in a year
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


    }
}
