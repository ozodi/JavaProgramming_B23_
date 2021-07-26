package day28_CustomMethods;

import java.util.Scanner;

public class MethodsWithParameter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age1 = input.nextInt();
        eligible(age1);



    }

    public static void eligible(int age){
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }

}
