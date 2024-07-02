package day25_constructors;

import java.time.LocalDate;

public class TestRectangleObjects {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,3.6);
        double result=r.area();
        System.out.println(result);
        System.out.println(r);

        Employee e=new Employee("Agn","Dev",15,'F',1596.36, LocalDate.of(2020,5,23));
        System.out.println(e);
    }
}
