package day19_Loops;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            System.out.print(i + " ");


        }

        System.out.println();
        System.out.println("Hello");
        System.out.println("-------------------------------");

        for (int i = 1; i <= 100; i++) { //i:1,2,3,4,5,6,7......100
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("------------------------");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("=============================================");

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("-======================-====================-=======");
        String odds = "";
        String evens = "";
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                odds += i + " ";
            } else {
                evens += i + " ";
            }
            System.out.print( odds);
            System.out.print(  evens);
        }

    }

}
