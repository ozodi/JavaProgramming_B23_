package day18_Recap;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two words:");
        String word1 = input.next();//"One"
        String word2 = input.next();// "eight" ==> // oneight

        if (word1.substring(word1.length() - 1).equalsIgnoreCase("" + word2.charAt(0))) {
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }
        input.close();

        /*
        if(word1.charAt(word1.length()-1) == word2.charAt(0)){

            //    Last Character of the first word
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
        */


    }

}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same,
print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */