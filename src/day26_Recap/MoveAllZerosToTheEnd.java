package day26_Recap;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length];
        //             {10, 0, 5, 0, 1, 0};

        for (int i = 0, j=0; i < array.length; i++) {
            if(array[i] != 0){ // 10, 5, 1
                result[j] = array[i];
                j++;// after initializing the index, go to the next index
            }
        }


       /*
        int i = 0;// index number of the result
        for (int each : array) { // each: 10,0,5,0,1,0
            if(each != 0){
                result[i++] = each;
            }
        }


        */
        System.out.println(Arrays.toString(result));




    }

}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
 */