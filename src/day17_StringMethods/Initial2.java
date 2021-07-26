package day17_StringMethods;

import java.util.Scanner;

public class Initial2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full Name");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1 );



    }

}
