package day25_Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        // index:        0,1,2,3,4

        for (int i = 0; i < numbers.length; i++) {// i: index number of the array
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------");

        for( int each: numbers){//each: elements of the array
            System.out.println(each);
        }
        System.out.println("=========================");

        String[] names = {"Ozodi","Ahmet", "Mahmet","Boburbek"};

        for( String eachName : names){
            System.out.println(eachName);
        }



    }

}
