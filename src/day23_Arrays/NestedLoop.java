package day23_Arrays;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for(int j = 1; j<= 5; j++){// otter loop
            for (int i = 1; i <= 5; i++) { // inner loop
                System.out.print(i+" ");
            }
            System.out.println();

        }


    }

}
