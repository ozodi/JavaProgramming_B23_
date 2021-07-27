package day36_ArrayList;

import Utilities.StringUtelity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,4,2,1,21,3,412,4,124,1));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,1,2,4,2,1,21,3,2,4,8,8,8,7,7,7));

        //list2.removeIf( p -> p < 5 );
        list2.removeIf( p -> p % 2 != 0);

        System.out.println(list2);

        System.out.println("------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad","Merve", "Feruza","Said","Kamiljon","Fhilipp"));
        names.removeIf(p -> p.contains("a"));
        System.out.println(names);

        System.out.println("--------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll( Arrays.asList("Anna","Rececar","Level","java", "python", "Cybertek","Sabas"));
        words.removeIf( p -> StringUtelity.isPalindrome(p));
/*
        for(int j = 0; j<= words.size(); j++){
            String reverse = "";
            for (int i = words.get(j).length()-1; i >= 0 ; i--) {
                reverse += words.get(j).charAt(i);
            }
            boolean isPalindrome =reverse.equalsIgnoreCase(words.get(j));
            words.removeIf(p -> isPalindrome );

        }


 */




        System.out.println(words);

    }
}
