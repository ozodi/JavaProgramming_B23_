package day23_Arrays;

public class FrequencyOfEachChar {

    public static void main(String[] args) {

        String str = "aabccc";
        String removeDup = "";// a b c

        for (int i = 0; i <= str.length()-1; i++) {

            char ch = str.charAt(i);

            if (removeDup.contains(""+ch)){// if the character is already contained in removeDup
                continue;// skip it
            }

            removeDup += ch;
        }
        System.out.println(removeDup);


        String result = "";//a2b1c3
                            //a b c
        // 2 1 3

        for (int j =0; j<=removeDup.length()-1; j++){
            char ch = removeDup.charAt(j); // 'a'
            int frequency  = 0; // for the frequency of ch
            for (int i = 0; i <= str.length()-1; i++) {
                char each = str.charAt(i);
                if(each == ch){
                    frequency++;
                }
            }
            result += ch +""+ frequency;
        }
        System.out.println(result);





    }

}
