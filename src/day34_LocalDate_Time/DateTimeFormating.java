package day34_LocalDate_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormating {

    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMM-dd-YYYY EEEE");

        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println( today.format(DF));

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime currentime  = LocalTime.now();


        System.out.println(currentime.format(TF));


        System.out.println("========================");


        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY  EEEE hh:mm a");

        LocalDateTime a = LocalDateTime.now();

        System.out.println(a.format(DTF));
    }

}
