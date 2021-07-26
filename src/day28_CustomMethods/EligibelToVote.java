package day28_CustomMethods;

import java.util.Scanner;

public class EligibelToVote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        eligble(input.nextInt(),input.next());

    }

    public  static void eligble(int age, String citizen){
        if(age>=18 && citizen.equals("USA")){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

}
