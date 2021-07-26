package day19_Loops;

import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 2147483647;
        for (int i = 1; i <= 5; i++){
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num < min){
                min = num;
            }

        }
        System.out.println(min + " is the minimum number");

        input.close();

    }

}
