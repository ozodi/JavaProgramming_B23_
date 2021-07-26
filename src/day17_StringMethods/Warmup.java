package day17_StringMethods;

import java.util.Scanner;

public class Warmup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        String account = input.next();


        if(account.length()==7 || account.length() == 10){
            if(account.charAt(0)=='2'&& account.length()==7){// if the first character is 2 && has 7 characters in
                System.out.println("valid account");
            }else if(account.charAt(0)=='5'&& account.length()==10){
                System.out.println("account number should be 10 characters long");
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid account number");
        }












        input.close();
        System.out.println("-------");

    }

}
/*1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not
     meet the expected results print “Invalid account number”

 */