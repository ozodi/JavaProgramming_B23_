package day18_Recap;

import java.util.Scanner;

public class DigitLetterSpechialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        char f = word.charAt(0);
        if (f>='0' && f<='9'){
            System.out.println("First character is a digit");
        }else if(f>='a'&& f<='z'){
            System.out.println("first character is lowercase");
        }else if (f>='A'&& f<='Z'){
            System.out.println("First character is uppercase letter");
        }else{
            System.out.println("First chacter is a special character");
        }
        input.close();

    }

}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

 */