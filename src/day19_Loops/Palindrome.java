package day19_Loops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        String word = new Scanner(System.in).next();
        String reverseWord = "";
        for (int i = word.length()-1; i >=0; i--) {
            reverseWord += word.charAt(i);

        }
        System.out.println(reverseWord);

       boolean isPolindrom  = word.equalsIgnoreCase(reverseWord);

       if(isPolindrom){
           System.out.println(word + " is polindrom ");
       }else{
           System.out.println(word + " is not polindrom");
       }


    }

}
