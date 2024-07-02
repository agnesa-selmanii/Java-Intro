package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Ana", 'F', LocalDate.of(1989, 3, 25));
        people[1].setInfo("Benn", 'M', LocalDate.of(2000, 6, 10));
        people[2].setInfo("Daniel", 'M', LocalDate.of(2020, 9, 1));
        people[3].setInfo("Nina", 'F', LocalDate.of(1999, 10, 6));
        people[4].setInfo("Betty", 'F', LocalDate.of(2004, 11, 30));

        ArrayList<Person> people1=new ArrayList<>(Arrays.asList(new Person(),new Person(),new Person()));
        people1.get(0).setInfo("Ana", 'F', LocalDate.of(1989, 3, 25));
        people1.get(1).setInfo("Ana", 'F', LocalDate.of(2020, 3, 25));
        people1.get(2).setInfo("Ana", 'M', LocalDate.of(2021, 5, 25));

        //remove students older than 18

        System.out.println(people1);

        System.out.println("------------Remove older than 18----------");

        people1.removeIf(p->p.age>18);
        System.out.println(people1);
    }
}
