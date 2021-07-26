package day14_Recap;

import java.util.Scanner;

public class Roommate {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many people they live with");
        int num=scan.nextInt();
        String result=" ";

        switch(num) {
            case 1:
            case 2:
                result = "Live with less than 3 people";

            case 3:
            case 4:
            case 5:
            case 6:
                result = "Live with 3 - 6 people";
                break;


            default:
                result="Live with more than 6 people";

        }
        System.out.println(result);

    }

}
/*
Switch:
        Ask the user how many people they live with?
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */