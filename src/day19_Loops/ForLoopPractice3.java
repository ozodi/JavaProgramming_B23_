package day19_Loops;

import java.util.Scanner;

public class ForLoopPractice3 {

    public static void main(String[] args) {
/*
        for (int i = 1; i <=50 ; i++) {
            System.out.println("Push Up " + i);
        }


 */

        for (int i = 1; i <= 8; i++){
            System.out.println("\t\t* * * * * *");
        }
        System.out.println("-----------------------------------");

        System.out.println("\t\t* * * * * *");
        for (int i = 1; i <= 8; i++){
            System.out.println("\t\t*         *");
        }
        System.out.println("\t\t* * * * * *");

        System.out.println("-----------------------==");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-------------------------------------");

        for (int i  = 1; i <= 10; i++){
            System.out.println("Enter a number");
            int num1 = input.nextInt();
        }





    }

}
