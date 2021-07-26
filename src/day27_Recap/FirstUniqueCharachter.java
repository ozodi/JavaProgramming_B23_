package day27_Recap;

public class FirstUniqueCharachter {

    public static void main(String[] args) {

        String str = "aaabbbcccddefffggggh";

        for(char each : str.toCharArray()){// each: represents each character of the result

            if(str.indexOf(each) == str.lastIndexOf(each)){// if the first and last character are the same it means the element is unique
                System.out.println(each);
                break;
            }

        }



    }

}
