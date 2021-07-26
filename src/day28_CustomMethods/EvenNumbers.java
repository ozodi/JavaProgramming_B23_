package day28_CustomMethods;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        even(input.nextInt(),input.nextInt());


    }


    public static void even(int from, int to){
        for (int i = from; i <= to; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    /*
     create a method
     that can print even numbers between 1~100

     */

}
