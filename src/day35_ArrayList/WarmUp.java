package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];


        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);

        }



        System.out.println(Arrays.toString(dates));
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");

        for(LocalDate each: dates){
            System.out.println(each.format(DTF));
        }



    }

}
