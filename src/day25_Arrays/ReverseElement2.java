package day25_Arrays;

public class ReverseElement2 {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#","Cyber"};
        for (String element : array){
            String reverse = "";

            for (int i = element.length()-1; i >= 0 ; i--) {

                reverse += element.charAt(i);
            }

            System.out.println(reverse);


        }

    }

}
