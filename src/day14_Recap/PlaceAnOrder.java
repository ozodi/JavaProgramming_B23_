package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Product name");
        String product = input.nextLine();
        System.out.println("The price");
        double price = input.nextDouble();
        System.out.println("Quantity");
        int quantity = input.nextInt();
        System.out.println("Your First Name");
        input.nextLine();
        String firstname = input.nextLine();
        double totoalPrice = quantity*price;

        System.out.println(firstname+","+" your order for "+ quantity+" "+product+" has been places. Your total is $"
                +totoalPrice);
        input.close();// closes the scanner
    }

}
/*
PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */