package day14_Recap;

public class LetterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        char ch = 'a';

        boolean isDigit = ch >= '0' && ch <= '9';//if the chareacter is between 0 and 9
        boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        // if the character is upper case letter or lower case letter
        //boolean isSpecial = !isDigit && !isLetter;

        String result = "";
        /*
        if (isDigit){
            result = (" is digit");
        }else if(isLetter){
           result = (" Letter");
        }else{
            result = ( " Special Character");
        }
        */
        result = (isDigit)? " is digit":(isLetter)?" is letter":" Special Character";


        System.out.println(ch + result);
    }


}
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character
 */