package day28_CustomMethods;

public class Odd {

    public static void main(String[] args) {

        odd(50,85);


    }

    public static void odd(int from, int to){
        for (int i = from; i <= to; i++) {
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        /*
        create a method that can print odd numbers
         between 1~100 in a same line seperated by space
         */
    }

}
