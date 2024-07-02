package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 900, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 1300, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 9500, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 10500, "A05");

        //names, job titles

        for (Employee each : employees) {
            System.out.println(each.name + " ---> " + each.jobTitle);
        }

        System.out.println("People that work as Java Developers");
        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) {
                System.out.print(each.name + "\t");
            }
        }

        System.out.println("\nWrite a program that can display the maximum and minimum salary");
        double max=employees.get(0).salary;
        double min=employees.get(0).salary;
        for (Employee each : employees) {

            if (each.salary>max)
            {
                max=each.salary;
            }

            if (each.salary<min)
            {
                min=each.salary;
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+ min);

        System.out.println("Create two arraylists named femaleEmployees and maleEmployees");

        ArrayList<Employee> fGender=new ArrayList<>();
        ArrayList<Employee> mGender=new ArrayList<>();

        for (Employee employee : employees) {
            if(employee.gender=='F')
            {
                fGender.add(employee);
            }
            if(employee.gender=='M')
            {
                mGender.add(employee);
            }
        }
        System.out.println("Total number of female employees: " + fGender.size());
        System.out.println("Total number of male employees: " + mGender.size());

        employees.removeIf(p->p.salary>1300);
        System.out.print(employees);

        System.out.println("REPLACING");

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","C#","C#","Ruby","Swift","Swift","Java"));

        System.out.println(names);

        /*for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java"))
            {
                names.set(i,"NewJava");
            }
        }*/

        Collections.replaceAll(names,"Java","NewCollectionJava");
        System.out.println(names);

        System.out.println( Collections.frequency(names,"Swift"));

        ArrayList<Integer> nr=new ArrayList<>(Arrays.asList(10,10,20,30,40,50,50,50,50,60));

        for (Integer i : nr) {
            if(Collections.frequency(nr,i)==1)
            {
                System.out.println(i);
            }
        }
    }
}
