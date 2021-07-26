package day30_Recap;

public class LoopsReview3 {

    public static void main(String[] args) {

        String sentence = "I love Java, Java is fun, Java Java Java";
        String word = "Java";
        int count  = 0;

        while(sentence.contains(word)){
            sentence =sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
        System.out.println("====================");


        for (int j = 1; j<=5; j++){
            for (int i = 1; i <= 10; i++) {
                System.out.print(i);
            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        String str = "aabcccd";


        for(int j = 0; j<=str.length()-1;j++){
            char ch = str.charAt(j);
            int frequency = 0;

            for(int i = 0; i<=str.length()-1; i++){
                if(str.charAt(i) == ch){
                    frequency++;

                }
            }
            if(frequency == 1){
                System.out.print(ch);

            }

        }




    }

}
