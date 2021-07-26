package day19_Loops;

import java.util.Scanner;

public class Miximum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            int num1 = input.nextInt();
            if (num1 > max) {
                max = num1;
            }

        }
        System.out.println(max + " is the maximum value ");

    }

}
