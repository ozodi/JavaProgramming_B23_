package day23_Arrays;

public class FrequencyOfACharacters {

    public static void main(String[] args) {

        String str = "aabcccccccccccs";
        char ch = 'c';
        int frequency = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);// every single characters that we have in str
            if (each == ch){// if the char in str is matching with ch
                frequency++;// then increase the frequency of ch by 1
            }
        }
        System.out.println(frequency);

    }

}
