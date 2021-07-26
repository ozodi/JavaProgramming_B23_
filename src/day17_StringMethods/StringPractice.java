package day17_StringMethods;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    /*


        String email = "rumiev@gmail.com";
        boolean isValid = email.endsWith("@gmail.com");
        String result = (isValid) ? "Valid" : "Invalid";
        System.out.println(result);
 */


/*
        String web = "www.some.gov";
        boolean isWWW = web.startsWith("www") && (web.endsWith(".com") || web.endsWith(".gov") || web.endsWith(".edu"));
        String result1  = (isWWW) ? "Valid" : "Invalid";
        System.out.println(result1);

*/

        System.out.println("Enter a word");
        String word = input.next();
        if (word.endsWith("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }
        input.close();


    }

}
