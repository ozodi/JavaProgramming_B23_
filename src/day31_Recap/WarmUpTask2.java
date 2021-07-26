package day31_Recap;




public class WarmUpTask2 {

    public static void main(String[] args) {

        String sentence = "Cybertek cybertek Cybertek";
        String word = "Cybertek";

        System.out.println(frequencyOfWord(sentence,word));



    }


    public static int frequencyOfWord(String sentence, String word){


        int count = 0;// 3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;

    }



}
