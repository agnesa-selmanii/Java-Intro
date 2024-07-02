package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MMMM/y"); //y-2023, yy-23, dMy
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MMM/y, E");
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("EEEE-MMMM/Y");
        //yMdE
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));
        System.out.println(today.format(df1));
        System.out.println(today.format(df2));

        System.out.println("\n---------------------------------\n");
        //H,HH:0-24, h,hh:0-12, s-sec, S-nanoSec, m-min, a-am/pm

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("hh-mm-ss");
        DateTimeFormatter dt1=DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println(time.format(dt));
        System.out.println(time.format(dt1));

        System.out.println("\n---------------------------------\n");

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("d/MMMM/y E  hh:mm:ss a");
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.format(dtf));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEEE, h:ss a, /MMMdd/y");
        LocalDateTime ldt1=LocalDateTime.now();
        System.out.println(ldt1.format(dtf1));
    }

}
