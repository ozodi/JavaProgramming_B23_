package day38_CostumeClass;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        /*
        rec1.width = 30;
        rec1.length = 20;

         */
        rec1.setInfo(30,20);
        rec1.getInfo();

        System.out.println("------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(50,10);
        rectangle2.getInfo();

        System.out.println("--------------------------");

        System.out.println(rec1);

    }

}
