package day17_StringMethods;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
        String initial = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
                        // D.J
        System.out.println(initial);

        /*
        char initials = names.charAt(0);
        char initials2 = name2.charAt(0);
        String initals3 = initials +"."+initials2;
        System.out.println(initals3);
         */
    }


}
/*
write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */