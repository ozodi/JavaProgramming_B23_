package day27_Recap;

import jdk.nashorn.internal.runtime.ScriptRuntime;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 ={"komiljon","Yuling"};
        String[] scrum2 = {"sbir","tamara"};
        String[] scrum3 = {"Tugba","Hilala"};

        String[][] scrumTeams = {scrum1, scrum2,scrum3};

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(Arrays.toString(scrumTeams[0]));

        System.out.println(scrumTeams[1][1]);
        System.out.println("====================================");

        for( String[] eachScrum : scrumTeams){
            for(String eachMember: eachScrum){
                System.out.println(eachMember);
            }
        }



    }

}
