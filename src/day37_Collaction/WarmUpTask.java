package day37_Collaction;


import Utilities.StringUtelity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList <Integer> list  = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,10,20,20,20,30,30,40,40,40,50,10,60));
        // first Task is done
        System.out.println(list);
        Collections.swap(list, 0,list.size()-1);
        System.out.println(list);
        //Second task is done
        int firstUnique = 0;
        for(Integer each: list){
            if(Collections.frequency(list,each)==1){
                firstUnique = each;
            }
            break;
        }

        System.out.println(firstUnique);

        System.out.println("-----------------");

        String str = "AABBCCDDEE";
        String result = "";
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList( str.split("")));

        for (String each : StringUtelity.removeDup(str).split("")) {//ABCDE
            int frequency  = Collections.frequency(list2,each);
            result+= each + ""+frequency;

        }

        System.out.println(result);

        System.out.println("-------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,10,10));

        // Collections.sort(numbers);
        //Collections.reverse(numbers);

        int n = 5;
        for (int i = 1; i < n; i++) {
            numbers.removeIf ( p -> p== Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers) ;

        System.out.println(fifthMaxNumber);



    }
}
/*
1.write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
 */