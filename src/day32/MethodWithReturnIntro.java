package day32;

public class MethodWithReturnIntro {
    public static int add2Numbers(int num1, int num2){
   return num1+num2;
    }
    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of "+num);
        int result = num*2;
        return result;
    }
    public static String givememyName(){
        return "Fatma";

    }
    public static void main(String[] args) {
   String name = givememyName();
        System.out.println("name :"+name);
        int myResult =doubleTheNumber(10);
        System.out.println("my result is "+myResult);
        System.out.println("result double 100 is "+doubleTheNumber(100));
        System.out.println(doubleTheNumber(5));
        System.out.println(doubleTheNumber(15));
        int add14to16Result =add2Numbers(14,16);
        System.out.println("add 14 to 16 result :"+add14to16Result);
        System.out.println(add2Numbers(14,16));

    }
}
