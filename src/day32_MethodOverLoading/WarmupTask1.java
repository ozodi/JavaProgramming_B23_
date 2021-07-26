package day32_MethodOverLoading;

public class WarmupTask1 {

    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }
    public static int sumOf3Numbers(int a,int b, int c ){
        return a+b+c;
    }

    //======================Method overloading=========================


    public static int sum(int a, int b){return a+b;}

    public static int sum(int a, int b,int c){return a + b + c; }

    public static int sum(int a, int b,int c, int d){
        //return sum(a,b) + sum(c,d);
        return sum( sum(a, b) , sum(c, d) );
    }

}
