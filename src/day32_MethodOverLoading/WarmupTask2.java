package day32_MethodOverLoading;

import java.util.Arrays;

public class WarmupTask2 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int element = 10;
        System.out.println(Arrays.toString(array));
        array = addInteger(array,element);

        System.out.println(Arrays.toString(array));
    }

    public static int[] addInteger(int[] array,int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = number;

        return result;

         */
        int[] result = Arrays.copyOf( array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

    // returning the maximum number from an array of integer
    public static int max(int[] array){
        int max = array[0];

        for (int each : array) {
           max = Math.max( each,max);
        }


        return max;
    }

    // returning the maximum number from an array of double
    public static double max(double[] array){
        double max = array[0];

        for (double each : array) {
            max = Math.max( each,max);
        }


        return max;
    }


}
