package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth()); //diten e muajit
        System.out.println(today.getDayOfYear()); //cila dit e vitit
        System.out.println(today.getDayOfWeek()); //dita e javes ne emer

        System.out.println("-----------------------------------------");

        LocalDate birthday=LocalDate.of(2004,2,23);
        System.out.println(birthday);
        System.out.println(birthday.getDayOfMonth());

        System.out.println("-----------------------------------------");

        today=today.plusYears(1);
        today=today.plusMonths(4);
        today=today.plusWeeks(4);
        System.out.println(today);

        System.out.println("-----------------------------------------");

        LocalDate yourBirthday=LocalDate.of(2005,4,1);
        LocalDate yourBrotherBirthday=yourBirthday.minusYears(1).minusMonths(3).minusDays(20);
        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);

        LocalDate yourBirthday1=LocalDate.of(2005,4,1);

        System.out.println(yourBirthday.isEqual(yourBirthday1));

        System.out.println(yourBirthday1.isBefore(LocalDate.now()));
        System.out.println(yourBirthday1.isAfter(LocalDate.now()));

        System.out.println(yourBirthday1.minusYears(1).isLeapYear()); //2004 is a leap year

    }
}
