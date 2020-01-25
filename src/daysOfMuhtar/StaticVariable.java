package daysOfMuhtar;

public class StaticVariable {
    static String name;
    static double num;



    public static void main(String[] args) {

        StaticVariable obj1 = new StaticVariable();
        obj1.name = "omer";
        System.out.println("name is "+name);
        System.out.println(obj1.name);
        StaticVariable obj2 = new StaticVariable();
        obj2.name = "Bekir";
        System.out.println(obj2.name);
        System.out.println(obj1.name);

        StaticVariable num1 = new StaticVariable();
        num1.num = 12;
        System.out.println(num1.num);

        StaticVariable num2 = new StaticVariable();
        num2.num = 10.5;
        System.out.println(num1.num);

       StaticVariable.method1();
    }
    public static void printHello(){
        System.out.println("hello Cybertek");
    }
    public static void method1(){
        System.out.println("aaabbbaaa");
    }
}