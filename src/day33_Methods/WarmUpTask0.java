package day33_Methods;

public class WarmUpTask0 {

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


}
