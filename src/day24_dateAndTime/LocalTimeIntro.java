package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime starting_time=LocalTime.of(0,0);
        LocalTime current_time=LocalTime.now();
        System.out.println(starting_time);
        System.out.println(current_time);
    }
}
