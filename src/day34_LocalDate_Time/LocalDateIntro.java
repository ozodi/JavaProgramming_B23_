package day34_LocalDate_Time;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

       LocalDate eid= LocalDate.of(2021,7,20);

        System.out.println(eid);

        System.out.println("----------------");

        String[] names = {"john", "daniel","josh", "jimmy"};
        LocalDate[] DoB = {LocalDate.of(1990,5,25),
                           LocalDate.of(1980,6,20),
                           LocalDate.of(1985,7,5),
                           LocalDate.of(1995,8,20)};



    }


}
