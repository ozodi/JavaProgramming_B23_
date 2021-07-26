package day21_Loops;

public class LetterDigitSpecialChar {

    public static void main(String[] args) {

        String input = "mn@#123Ab!";
        String letters = "";//mnAb
        String digits = "";// 123
        String specialChars = "";//@#!

        for (int i = 0; i <= input.length()-1; i++){
            char each = input.charAt(i);
            if (each >= 'A'&& each <= 'Z'|| each >= 'a'&& each<='z'){
                letters += each;
            }else if(each >= '0' && each<= '9'){
                digits+=each;
            }else{
                specialChars+=each;
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }

}
/*
. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */