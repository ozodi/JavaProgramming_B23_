package day30_Recap;

public class LoopsReview {

    public static void main(String[] args) {

        String name = "Java";
        for (int i = 0; i <= name.length()-1; i++) {
            System.out.println(name.charAt(i));

        }
        System.out.println("====================");


        for (int i = 1,ch = 65 ; i <= 26; i++, ch++) {
            System.out.println(i+" "+ (char)ch);
        }

        System.out.println("=====================");

        for (int i = 26, ch = 90; i >= 1; i--, ch--) {
            System.out.println(i+" "+(char)ch);
        }
        System.out.println("=====================");


        for(char i = 'A', j= 'a'; i<= 'Z'; j++, i++){
            System.out.println(i +"-"+j);
        }

        System.out.println("----------------");

        String word = "python";
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);

        }

        boolean isPalindrome = word.equals(reverse);


        System.out.println(isPalindrome);



    }


}
