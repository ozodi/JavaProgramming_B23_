package day37_Collaction;

public class Dog {

    public String  name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    public void eat(String food){
        System.out.println(name+" is eating");
    }

    public void drink( String drink){
        System.out.println(name+" is drinking "+ drink);
    }
    public void bark(){
        System.out.println(name+" is barking ");
    }
    public void play(){
        System.out.println( name+" is  playing");
    }


    public void setInfo(String dogName, String dogBreed, String dogGender,String dogColor, String dogSize, int dogAge){
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        age = dogAge;
        size = dogSize;
        color = dogColor;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);



    }






}
