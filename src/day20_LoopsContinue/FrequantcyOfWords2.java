package day20_LoopsContinue;

public class FrequantcyOfWords2 {

    public static void main(String[] args) {

        String sentence = "book book book";
        String word = "book";
        int count = 0;

        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            String each = sentence.substring(i,i+word.length());
            if (each.equals(word)){
                count++;
            }
        }
        System.out.println("count = " + count);

    }

}
