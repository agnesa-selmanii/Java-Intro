package day36_polymorphism;

import day31_methodOverriding.employeeTask.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", "CYDEO", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", "CYDEO", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", "CYDEO", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", "CYDEO", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", "CYDEO", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", "CYDEO", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", "CYDEO", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", "CYDEO", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", "CYDEO", 95000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", "CYDEO", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", "CYDEO", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", "CYDEO", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", "CYDEO", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", "CYDEO", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", "CYDEO", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", "CYDEO", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", "CYDEO", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", "CYDEO", 105000),
                new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", "CYDEO", 85000),
        };

        //  2.1 store all the developers & testers into the following List of employees
        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Developer || employee instanceof Tester) {
                scrumMembers.add(employee);
            }
        }

        System.out.println(scrumMembers);

        System.out.println("----------------------------------------------------------------");

        //  2.2 store all the developers into the following List of employees
        List<Employee> developers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                developers.add(employee);
            }
        }

        System.out.println(developers);

        System.out.println("----------------------------------------------------------------");

        //  2.3 store all the testers into the following List of employees
        List<Employee> testers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Tester) {
                testers.add(employee);
            }
        }

        System.out.println(testers);

        System.out.println("----------------------------------------------------------------");


        // 2.4 which tester has the maximum salary?
        Tester maxTester = (Tester) testers.get(0);

        for (Employee tester : testers) {
            if (tester.getSalary() > maxTester.getSalary()) {
                maxTester = (Tester) tester;
            }
        }

        System.out.println(maxTester);

        System.out.println("----------------------------------------------------------------");

        // 2.5 which developer has the maximum salary?
        Developer maxDeveloper = (Developer) developers.get(0);

        for (Employee developer : developers) {
            if (developer.getSalary() > maxDeveloper.getSalary()) {
                maxDeveloper = (Developer) developer;
            }
        }

        System.out.println(maxDeveloper);


    }

}

/*
2. Given the following array that contains Employee objects:
			 Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28,'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M',"A05", "SDET", 105000),
                new Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora",  28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
                new Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana",  25, 'F',"A09", "SDET", 130000),
                new Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur",  29, 'M',"A11", "SDET", 115000),
                new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan",  26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia",  24, 'F', "A13", "QE", 125000),
                new Developer("Ermek",  26, 'M',"A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar",  30, 'M',"A15", "SDET", 105000),
                new Teacher("Conor", 35,  'M', "B2", "Physics Teacher", 85000),
        };

    		(import them from day33 package)

	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?

 */