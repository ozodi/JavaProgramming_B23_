package day31_Recap;

import java.util.Arrays;

public class BreakFast {

    public static void main(String[] args) {

        String str = "AAABBBCCCC";





    }


    public static int frequency(String a, char ch){
        int count = 0;

        for (char c : a.toCharArray()) {
            if(c == ch){
                count++;
            }

        }

        return count;
/*
        for (int i = 0; i <= a.length()-1; i++) {

            if(a.charAt(i) == ch){
                count++;
            }

        }
        return count;

 */

    }
    public static String removeDup(String str) {
        String result = "";//"ABC"

        for (char ch : str.toCharArray()) {

            if(!result.contains(""+ch)){ // result.indexOf(ch) < 0
                result+= ch;
            }

        }

        return result;
    }
    public static boolean isAnogram(String str1, String str2){
        char[] chr1 = str1.toCharArray();//{'h', 'e', 'a','r','t'}
        char[] chr2 = str2.toCharArray();//{'e', 'a' , 'r', 't','h'}

        Arrays.sort(chr1);// {a,e,h,r,t}
        Arrays.sort(chr2);// {a,e,h,r,t}

        return Arrays.equals(chr1,chr2);


    }
    public static String uniqueChars(String s){

        String unique = "";

        for (int i = 0; i <=s.length()-1 ; i++) {
            char each  = s.charAt(i);
            int frequency = frequency(s,each);
            if(frequency == 1){
                unique+=each;
            }
        }

        return unique;
    }
    public static String frequencyOfChar(String str){
        String result = "";
        for (char each : removeDup(str).toCharArray()) {
            result+=""+each+frequency(str,each);//A3


        }
        return result;
    }


}
/*
Write a return method named frequency that accepts two parameters:
 String and Char. then returns the frequency of the char from the string
            Ex:
                frequency("AAABB", 'A');  ==> 3
 */