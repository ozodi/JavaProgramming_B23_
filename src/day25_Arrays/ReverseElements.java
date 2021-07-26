package day25_Arrays;

import java.util.Arrays;

public class ReverseElements {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j < array.length; j++) {

            String element = array[j];//
            String reverse = ""; // avaJ
            for (int i = element.length()-1; i >= 0; i--) {
                char each  = element.charAt(i);
                reverse += each;
            }

            array[j] = reverse;

        }


        System.out.println(Arrays.toString(array));
    }

}
/*
write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"}

            output:
                ["avaJ", "nohtyP", "#C"]
 */