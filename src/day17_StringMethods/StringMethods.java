package day17_StringMethods;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
/*
        String sentence = "My favorite programming languages are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);
        System.out.println("----------------------------");
        String sentence2 = "Cybertek School is the best";
        boolean startwithCybertek = sentence2.startsWith("Cybertek");
        boolean endwithbest = sentence2.endsWith("best");
        System.out.println("startwithCybertek = " + startwithCybertek);
        System.out.println("endwithbest = " + endwithbest);

     String email = "rumiev@gmail.com";
        boolean isValid = email.endsWith("@gmail.com");
        String result = (isValid) ? "Valid" : "Invalid";
        System.out.println(result);


        String web = "www.some.gov";
        boolean isWWW = web.startsWith("www") && (web.endsWith(".com") || web.endsWith(".gov") || web.endsWith(".edu"));
        String result  = (isWWW) ? "Valid" : "Invalid";
        System.out.println(result);
      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        if (word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

    }


}
/*
ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */