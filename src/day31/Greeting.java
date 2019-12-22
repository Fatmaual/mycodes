package day31;

public class Greeting {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("My Family");
        sayHelloTo("kids");


    }
    public static void sayHelloTo(String str){
        System.out.println("Hello "+str);

    }
    public static void sayHello(){
        System.out.println("Batch15");
    }
}
