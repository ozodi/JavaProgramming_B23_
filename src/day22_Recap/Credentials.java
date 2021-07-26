package day22_Recap;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {
        String correctUsername =  "cybertek";
        String correctPassword =  "cybertek12345";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the username:");
        String u = input.next();

        System.out.println("Enter the password: ");
        String p = input.next();

        if (u.equals(correctUsername) && p.equals(correctPassword)){
            System.out.println("Logged In");
        }else{ // if the user provides incorrect username or password

            for (int i = 0; i <= 2; i++) {
                System.out.println("Username or password is incorrect, please re-enter");
                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals(correctUsername) && p.equals(correctPassword)){//if the user credentials are correct
                    System.out.println("Logged In:");
                    break;// exits the loop
                }
                if (i == 2){// if user entered credentials are incorrect, and we already used all the attempts
                    System.err.println("Your account is locked");
                    System.exit(0);
            }


            }

        }

        System.out.println("Hello Cybertek");




    }

}



/*
You are writing a code for the log-in function of the
Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts to enter
                correct credentials and if all three attempts are failed, then print
                "Your account is lucked."
 */