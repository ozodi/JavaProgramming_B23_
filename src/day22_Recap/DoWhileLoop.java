package day22_Recap;

public class DoWhileLoop {

    public static void main(String[] args) {
       /*
        int i = 10;
        while(i < 5){
            System.out.println("Hello Cybertek");
        }

        System.out.println("-----------------------------");

        do{
            System.out.println("Hello Cybertek");
        }while (i < 5);


        */

        int  i = 0;
        int count = 0;
        do{
            if (i%2 == 0){
                System.out.println(i);
            }
            count++;
        }while(i<=10);

    }

}
