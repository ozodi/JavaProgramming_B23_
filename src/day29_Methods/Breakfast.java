package day29_Methods;

import java.util.Scanner;

public class Breakfast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int numm= input.nextInt();
        positiveNevativeZero(numm);

        */

    }



    public static void positiveNevativeZero(int num){
        String result = "";
        if(num>0){
            result = "positive";
        }else if(num<0){
            result = "negative";
        }else{
            result = "zero";
        }

        System.out.println(result);
    }

    /*
    create a function that can check
     if the given integer is positive, negative
     or zero

     create a function that can
     print out the combination of
     two integer arrays


     */

}
