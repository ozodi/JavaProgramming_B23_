package day24_ArraysContinu;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        /*
        heart && earth
        race && care
        listen && silent

        output: true

         */

        String s1 = "heart";
        String s2 = "earth";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);// ch1 will be in ascending order
        Arrays.sort(ch2);// ch2 will be in ascending order

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println(isAnagram);

    }


}
