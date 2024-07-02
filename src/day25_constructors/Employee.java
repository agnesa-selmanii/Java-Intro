package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, String jobTitle, int age, char gender, double salary, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("dd/MM/yy, EEEE")) +
                ", years worked=" + (LocalDate.now().getYear()- hiredDate.getYear()) +
                '}';
    }
}
