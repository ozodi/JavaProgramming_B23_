package Utilities;

public class ArraysUtilities {


    //remove the element at given index of the array
    public static int[] remove(int[] array, int index){
        int[] result = new int[ array.length-1];

        for (int i = 0, j=0; i < array.length; i++) {

            if(i == index){// moves all the elements of array except the element at given index
                continue;
            }else{
                result[j++] =array[i];
            }
        }

        return result;

    }
    //{1,2,3,4,5}
    //{1,2,4,5}

    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1, j= 0; i >=0 ; i--,j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length-1, j= 0; i >=0 ; i--,j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length-1, j= 0; i >=0 ; i--,j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length-1, j= 0; i >=0 ; i--,j++) {
            result[j] = array[i];
        }

        return result;
    }


}
