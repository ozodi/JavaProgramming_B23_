package day17_StringMethods;

import java.util.Scanner;

public class Warup3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String first  = word.substring(0,1);
        String last = word.substring(word.length()-1);

        if (first.equalsIgnoreCase(last)){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

        input.close();


    }



}
/*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */