package day24_ArraysContinu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversedArray= new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0 ; i--, j++) {// i is the index number of array starting from last index
                                                                // j is index of number of reversedArray

            reversedArray[j] = array[i];//we get  the elements of the array starting last index and store it into reverse


        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));


    }

}
/*
Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */