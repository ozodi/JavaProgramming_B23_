package day23_Arrays;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // index: 0                                                                         6

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=7){
            System.out.println(days[n-1]);

        }else{
            System.out.println("Invalid");
        }

    }

}
