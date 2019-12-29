package day34;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        System.out.println("method overloading ");
        System.out.println(12);
        String name= "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));
        //two version of indexOf method (there are 4 options try all of them)
        System.out.println(name.indexOf("o",2));
        System.out.println(name.indexOf("di"));
        System.out.println("=====================");
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(100);
        System.out.println(sayHello("Muge","Orman"));
    }
    public static void sayHello(){
        System.out.println("hello, World");
    }
    public static void sayHello(String name){
        System.out.println("hello, "+name);
    }
    public static void sayHello(int num){
        System.out.println("hello, "+num);
    }
    public static String sayHello(String firstname, String lastname){
        return "hello "+firstname+" "+lastname;
    }
}
