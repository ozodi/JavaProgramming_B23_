package day24_ArraysContinu;

public class FrequencyOfElements {

    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j <= arr.length-1; j++) {


            int element = arr[j];
            int count = 0; // to store the frequency of the element
            for (int i = 0; i <= arr.length-1; i++) {// used to find the frequency of one element
                if(arr[i] == element){// if the element is occurred in the array
                    count++;


                }
            }

            if(count == 1){//  to check if the element is unique
                System.out.println(element);
            }


        }





    }

}
/*
write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */