package day23_Arrays;

public class NestedLoop3 {

    public static void main(String[] args) {


        for (int j =1; j <= 8; j++){// j: number of lines
            for (int i = 1; i <= j; i++) {// i: number of  * in each line
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
