package day14_Recap;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int n = input.nextInt();
        String result = "";
        if(n>=1 && n<=100000){// if the number is valid
            if (n<=9){// false: n>9
                result = "is one digit";
            }else if (n<=99){
                result  = "is two digits";
            }else if (n<=999){
                result = " is three digits";
            }else if (n<=9999){
                result = "is four digits";
            }else if (n<99999){
                result = " is five digits";
            }else{
                result = "is six digits";
            }

        }else{
            result = ("Invalid number");
        }
        System.out.println(result);

    }

}
/*
Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits

 */