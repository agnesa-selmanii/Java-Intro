package day24_dateAndTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTime {
    public static void main(String[] args) {
        //LocalDtae, LocalTime, LocalDateTime, DateTimeFormatter

        LocalDate birthday=LocalDate.now();
        LocalDate birthday1=LocalDate.of(2020, 2,20);

        LocalTime time=LocalTime.now();
        LocalTime time1=LocalTime.of(2,55,36,25);

        LocalDateTime local=LocalDateTime.now();
        LocalDateTime local1=LocalDateTime.of(2020,2,20,3,25,55);

        System.out.println(birthday);
        System.out.println(birthday1);

        System.out.println(time);
        System.out.println(time1);

        System.out.println(local);
        System.out.println(local1);
    }
}
