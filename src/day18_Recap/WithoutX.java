package day18_Recap;

import java.util.Locale;
import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");
        String word = input.next().trim();
        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

        input.close();

        System.out.println("-----------------------------------------");

        String sentence = "I love Java programming language";
        if (sentence.toLowerCase().contains("Java")){ // we can ignore the case sensitivity by creating lower case version;
            System.out.println("Has Java");
        }else{
            System.out.println("Does not hava Java");
        }
        System.out.println("------------------");
        String s1 = "I love cats and dogs";
        //boolean loveCats = s1.equalsIgnoreCase("cats"); // verigies if s1 is "cats"
        boolean loveCats = s1.toLowerCase().contains("Cats");



    }

}
/*
Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */