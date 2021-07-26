package day19_Loops;

import java.util.Scanner;

public class ForLoopPractice4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        int sum = 0;
        for (int i  = 1; i <= 10; i++){
            System.out.println("Enter a number");
            int num1 = input.nextInt();
            sum += num1;
        }
        System.out.println(sum);

*/



        int max = 0 ;
        for (int i = 1; i <=5; i++){
            System.out.println("Enter a number:");
            int num1 = input.nextInt();
            if (num1 > max){
                max = num1;
            }

        }
        System.out.println(max + " is the maximum value ");










    }

}
