package day24_ArraysContinu;

import java.util.Arrays;

public class ClassMates {

    public static void main(String[] args) {

        String[] classmates = {"Ozodi","guliston","Fruza",};

        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <= classmates.length-1; i++) {
            System.out.println(classmates[i].substring(0,3));
        }






    }

}
/*
create string array, and store the names of your
class mates (10)
            print the first three characters
            of each name
 */