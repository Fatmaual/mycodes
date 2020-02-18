package daysOfMuhtar.PoliOfis;

class Child extends Parent{
    String lastName;
    int age;

    public Child(){

    }
    public void doHomework(){
        System.out.println("child is doing his/her homework");
    }
}

public class Parent {
    String name;
    int age;
    int SSN;

    public void cookFood(String foodName){
        System.out.println("cooking "+foodName);
    }

    public static void hi(){
        System.out.println("hello");
        System.out.println("12345");
        System.out.println(false);
    }
    public static String hello(){
        return "Hello Cybertek";
    }
public static String hi(String name){
        return "Hello"+ name;
}
    public static void main(String[] args) {
        //call void method
        hi();
        //call return method -->2 ways to call it
        System.out.println(hello());
        //2nd way
        String greeting=hello();
        System.out.println(greeting);

        String word="java";
        System.out.println(word.length());

        int lengthOfWord=word.length();
        int number;//local variable
     //   System.out.println(number); doesn't compile bc that is local variable

    }
}
