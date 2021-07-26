package Utilities;

import java.util.Arrays;

public class StringUtelity {
    public static String removeDup(String str) {
        String result = "";//"ABC"

        for (char ch : str.toCharArray()) {

            if(!result.contains(""+ch)){ // result.indexOf(ch) < 0
                result+= ch;
            }

        }

        return result;
    }
    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }
    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){ // "Java"
        String reversedStr =  reverse(str);  //"avaJ"
        return  str.equalsIgnoreCase(reversedStr);
    }
    // is Anogram
    public static boolean isAnogram(String str1, String str2){
        char[] chr1 = str1.toCharArray();//{'h', 'e', 'a','r','t'}
        char[] chr2 = str2.toCharArray();//{'e', 'a' , 'r', 't','h'}

        Arrays.sort(chr1);// {a,e,h,r,t}
        Arrays.sort(chr2);// {a,e,h,r,t}

        return Arrays.equals(chr1,chr2);


    }
   // frequency of the charcters
    public static int frequency(String a, char ch){

        int count = 0;


        for (int i = 0; i <= a.length()-1; i++) {
            if(a.charAt(i) == ch){
                count++;
            }

        }
        return count;

    }

    //  returns the unique charcters from the string
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
    // return the frequency of the chars
    public static String frequencyOfChar(String str){
        String result = "";
        for (char each : removeDup(str).toCharArray()) {
            result+=""+each+frequency(str,each);//A3


        }
        return result;
    }
    // return the frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word){


        int count = 0;// 3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;

    }

}

