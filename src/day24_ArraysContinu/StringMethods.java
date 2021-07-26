package day24_ArraysContinu;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        // split
        String sentence = "I love learning java programming language";

        String[] word =  sentence.split(" ");

        System.out.println(Arrays.toString(word));

        for (int i = word.length-1; i >= 0; i--) {
            System.out.print(word[i]+" ");
        }
        System.out.println();

        String email = "Cybertek@gamil.com";

        String firstname = email.split("@")[0];
        System.out.println("firstname = " + firstname);



        // toCharArray()

        String str = "ABCDE";
        char[] characters  = str.toCharArray();
        System.out.println( Arrays.toString(characters));



    }

}
