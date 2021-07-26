package day23_Arrays;

public class MyClassMates {

    public static void main(String[] args) {


        //if don't know what are the elements are but we know how may elements we want to store

        String[] friends = new String[5];

        friends[0] =  "Ozodi";
        friends [1] = "Isra";
        friends [3] = "Mohammed";
        friends[2] = "Kemaljan";
        friends[4] = "Kemal";

        for (int i = 0; i <= friends.length-1; i++) {
            System.out.println(friends[i]);
        }

    }


}
