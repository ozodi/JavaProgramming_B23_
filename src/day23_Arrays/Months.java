package day23_Arrays;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String[] months = {"Jan","Feb","Mar","Apr","May"};
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();
        if (n>=1 && n<=12){
            System.out.println(months[n-1]);

        }else{
            System.out.println("Invalid Number");
        }

    }

}
