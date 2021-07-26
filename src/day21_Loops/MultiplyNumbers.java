package day21_Loops;

public class MultiplyNumbers {

    public static void main(String[] args) {
        int a = 5,
            b= 4;
        if(b<0){
            b*= - 1;
        }
        int result = 0;
        for (int i  = 0; i < b; i++){
            result+=a;
        }

        System.out.println(result);
    }

}
/*
 write a program that can multiply two numbers without using * operator
 */