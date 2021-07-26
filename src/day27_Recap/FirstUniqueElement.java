package day27_Recap;

public class FirstUniqueElement {

    public static void main(String[] args) {

     int[] num = {1,2,4,4,9,2,1,2,1,5,2,3,6,7,7,8} ;
     int firstUniqueElement = 0;


        for (int j = 0; j < num.length; j++) {

            int frequency = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == num[j]) {
                    frequency++;
                }
            }
            if(frequency == 1){// if the element is unique
                firstUniqueElement = num[j];
                break;// to make sure only the first unique element is returned from the loop.
               // System.out.println(num[j]);
            }
        }

        System.out.println("firstUniqueElement = " + firstUniqueElement);

    }

}
/*
write a program that can return the first unique element from the array
 */