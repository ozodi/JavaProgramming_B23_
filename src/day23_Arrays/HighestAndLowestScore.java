package day23_Arrays;

public class HighestAndLowestScore {

    public static void main(String[] args) {

        int[] score = {85,70,95,90,100};
        String[] names = {"Mike","Adam","Tonny","John","Ammy"};

        int maxScore = score[0] ;
        String maxName = "";
        for (int i = 0; i <= names.length-1 ; i++) {
            String eachName = names[i];
            int eachScore = score[i];

            if(eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }


        }

        System.out.println(maxScore);
        System.out.println(maxName);


    }

}
